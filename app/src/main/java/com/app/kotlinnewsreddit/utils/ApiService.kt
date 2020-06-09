package com.app.kotlinnewsreddit.utils

import com.app.kotlinnewsreddit.model.KotlinNewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("kotlin/.json?")
    fun getKotlinNewsData(): Call<KotlinNewsResponse>
}