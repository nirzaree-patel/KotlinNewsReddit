package com.app.kotlinnewsreddit.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.kotlinnewsreddit.R
import com.app.kotlinnewsreddit.adapter.KotlinNewsAdapter
import com.app.kotlinnewsreddit.model.KotlinNewsResponse
import com.app.kotlinnewsreddit.model.News
import com.app.kotlinnewsreddit.utils.ApiService
import com.app.kotlinnewsreddit.utils.Constants
import com.app.kotlinnewsreddit.utils.setDivider
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class KotlinNewsListActivity : AppCompatActivity() {

    lateinit var txt_message: TextView
    lateinit var rv_news_list: RecyclerView
    lateinit var kotlinNewsAdapter: KotlinNewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_list)
        init()
    }

    fun init() {
        rv_news_list = findViewById(R.id.rv_news_list);
        txt_message = findViewById(R.id.txt_message)

        txt_message.setOnClickListener(View.OnClickListener { view: View? ->
            getCurrentData()
        })

        rv_news_list.setLayoutManager(LinearLayoutManager(this));
        getCurrentData()
    }

    internal fun getCurrentData() {
        val retrofit = Retrofit.Builder()
                .baseUrl(Constants.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val service = retrofit.create(ApiService::class.java)
        val call = service.getKotlinNewsData()
        var noDataFound = false
        call.enqueue(object : Callback<KotlinNewsResponse> {
            override fun onResponse(call: Call<KotlinNewsResponse>, response: Response<KotlinNewsResponse>) {
                if (response.code() == 200) {
                    val kotlinNewsData = response.body()!!

                    if (kotlinNewsData.data?.news!!.size == 0)
                        noDataFound = true
                    else {
                        txt_message.visibility = View.INVISIBLE
                        kotlinNewsAdapter = KotlinNewsAdapter(kotlinNewsData.data.news) { news: News, position: Int ->
                            var intent = Intent(this@KotlinNewsListActivity, KotlinNewsDetailActivity::class.java)
                            intent.putExtra("item", news)
                            startActivity(intent)
                        }
                        rv_news_list.setAdapter(kotlinNewsAdapter);
                        rv_news_list.setHasFixedSize(true);
                        rv_news_list.setDivider(R.drawable.recycler_view_divider)
                    }

                    if (noDataFound) {
                        txt_message.text = "No Data found.\n" + "click me to retry!"
                    }

                }
            }

            override fun onFailure(call: Call<KotlinNewsResponse>, t: Throwable) {
                txt_message.text = "Please check your network connection.\nclick me to retry!"
            }
        })
    }


}