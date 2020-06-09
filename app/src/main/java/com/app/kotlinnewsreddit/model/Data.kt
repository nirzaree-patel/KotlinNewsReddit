package com.app.kotlinnewsreddit.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Data(
        @SerializedName("after")
    val after: String? = "",
        @SerializedName("children")
    val news: List<News>? = listOf(),
        @SerializedName("dist")
    val dist: Int? = 0,
        @SerializedName("modhash")
    val modhash: String? = ""
) : Parcelable