package com.app.kotlinnewsreddit.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.kotlinnewsreddit.R
import com.app.kotlinnewsreddit.model.News
import com.squareup.picasso.Picasso

class KotlinNewsDetailActivity : AppCompatActivity() {
    val picasso: Picasso = Picasso.get()
    lateinit var imgNewsDetail: ImageView
    lateinit var txtNewsDetailDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_news_detail)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        init()
    }

    fun init() {
        val news = intent.getParcelableExtra("item") as? News
        setTitle(news?.newsDetail!!.title)

        imgNewsDetail = findViewById(R.id.img_news_detail)
        txtNewsDetailDesc = findViewById(R.id.txt_news_detail_desc)

        txtNewsDetailDesc.setText(news.newsDetail.selftext)

        if (txtNewsDetailDesc.text == null || txtNewsDetailDesc.text.length == 0) {
            txtNewsDetailDesc.setText("No data found.")
        } else {
//            txtNewsDetailDesc.setMovementMethod(ScrollingMovementMethod())
        }

        var thumbnail: String = news.newsDetail.thumbnail!!

        if (!thumbnail.equals("")) {
            imgNewsDetail.visibility = View.VISIBLE;
            picasso.load(thumbnail).into(imgNewsDetail)
        } else {
            imgNewsDetail.visibility = View.GONE;
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}