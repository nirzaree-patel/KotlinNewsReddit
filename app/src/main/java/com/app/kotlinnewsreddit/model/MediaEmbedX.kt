package com.app.kotlinnewsreddit.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class MediaEmbedX(
    @SerializedName("content")
    val content: String? = "",
    @SerializedName("height")
    val height: Int? = 0,
    @SerializedName("scrolling")
    val scrolling: Boolean? = false,
    @SerializedName("width")
    val width: Int? = 0
) : Parcelable