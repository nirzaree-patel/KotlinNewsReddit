package com.app.kotlinnewsreddit.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class SecureMediaEmbedX(
    @SerializedName("content")
    val content: String? = "",
    @SerializedName("height")
    val height: Int? = 0,
    @SerializedName("media_domain_url")
    val mediaDomainUrl: String? = "",
    @SerializedName("scrolling")
    val scrolling: Boolean? = false,
    @SerializedName("width")
    val width: Int? = 0
) : Parcelable