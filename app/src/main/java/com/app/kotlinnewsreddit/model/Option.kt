package com.app.kotlinnewsreddit.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Option(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("text")
    val text: String? = "",
    @SerializedName("vote_count")
    val voteCount: Int? = 0
) : Parcelable