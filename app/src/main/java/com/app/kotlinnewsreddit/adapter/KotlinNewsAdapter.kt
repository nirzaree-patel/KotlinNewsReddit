package com.app.kotlinnewsreddit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.kotlinnewsreddit.R
import com.app.kotlinnewsreddit.model.News
import com.squareup.picasso.Picasso

class KotlinNewsAdapter(val list: List<News>, val clickListener: (News, Int) -> Unit) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.row_news_list, parent, false)
        return NewsViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news: News = list[position]
        holder.bind(news)
        holder.view.setOnClickListener { clickListener(news, position) }
    }

    override fun getItemCount(): Int = list.size

}

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var txtNewsTitle: TextView? = null
    private var imgNews: ImageView? = null
    val picasso: Picasso = Picasso.get()
    lateinit var view: View

    init {
        txtNewsTitle = itemView.findViewById(R.id.txt_news_title)
        imgNews = itemView.findViewById(R.id.img_news)
        view = itemView
    }

    fun bind(news: News) {
        txtNewsTitle?.setText(news.newsDetail!!.title)

        val thumbnail: String = news.newsDetail?.thumbnail!!

        if (!thumbnail.equals("")) {
            imgNews!!.visibility = View.VISIBLE;
            picasso.load(thumbnail).into(imgNews)
        } else {
            imgNews!!.visibility = View.GONE;
        }

    }

}