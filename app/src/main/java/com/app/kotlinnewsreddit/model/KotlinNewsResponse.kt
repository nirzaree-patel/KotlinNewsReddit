package com.app.kotlinnewsreddit.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class KotlinNewsResponse(
    @SerializedName("data")
    val `data`: Data? = Data(),
    @SerializedName("kind")
    val kind: String? = ""
) : Parcelable