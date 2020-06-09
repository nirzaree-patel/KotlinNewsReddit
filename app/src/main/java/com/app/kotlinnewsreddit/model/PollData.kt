package com.app.kotlinnewsreddit.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class PollData(
    @SerializedName("options")
    val options: List<Option>? = listOf(),
    @SerializedName("total_vote_count")
    val totalVoteCount: Int? = 0,
    @SerializedName("voting_end_timestamp")
    val votingEndTimestamp: Long? = 0
) : Parcelable