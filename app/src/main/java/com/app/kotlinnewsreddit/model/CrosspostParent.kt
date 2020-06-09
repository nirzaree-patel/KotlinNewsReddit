package com.app.kotlinnewsreddit.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class CrosspostParent(
    @SerializedName("allow_live_comments")
    val allowLiveComments: Boolean? = false,
    @SerializedName("archived")
    val archived: Boolean? = false,
    @SerializedName("author")
    val author: String? = "",
    @SerializedName("author_flair_type")
    val authorFlairType: String? = "",
    @SerializedName("author_fullname")
    val authorFullname: String? = "",
    @SerializedName("author_patreon_flair")
    val authorPatreonFlair: Boolean? = false,
    @SerializedName("author_premium")
    val authorPremium: Boolean? = false,
    @SerializedName("can_gild")
    val canGild: Boolean? = false,
    @SerializedName("can_mod_post")
    val canModPost: Boolean? = false,
    @SerializedName("clicked")
    val clicked: Boolean? = false,
    @SerializedName("contest_mode")
    val contestMode: Boolean? = false,
    @SerializedName("created")
    val created: Double? = 0.0,
    @SerializedName("created_utc")
    val createdUtc: Double? = 0.0,
    @SerializedName("domain")
    val domain: String? = "",
    @SerializedName("downs")
    val downs: Int? = 0,
    @SerializedName("gilded")
    val gilded: Int? = 0,
    @SerializedName("gildings")
    val gildings: Gildings? = Gildings(),
    @SerializedName("hidden")
    val hidden: Boolean? = false,
    @SerializedName("hide_score")
    val hideScore: Boolean? = false,
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("is_crosspostable")
    val isCrosspostable: Boolean? = false,
    @SerializedName("is_meta")
    val isMeta: Boolean? = false,
    @SerializedName("is_original_content")
    val isOriginalContent: Boolean? = false,
    @SerializedName("is_reddit_media_domain")
    val isRedditMediaDomain: Boolean? = false,
    @SerializedName("is_robot_indexable")
    val isRobotIndexable: Boolean? = false,
    @SerializedName("is_self")
    val isSelf: Boolean? = false,
    @SerializedName("is_video")
    val isVideo: Boolean? = false,
    @SerializedName("link_flair_background_color")
    val linkFlairBackgroundColor: String? = "",
    @SerializedName("link_flair_text_color")
    val linkFlairTextColor: String? = "",
    @SerializedName("link_flair_type")
    val linkFlairType: String? = "",
    @SerializedName("locked")
    val locked: Boolean? = false,
    @SerializedName("media_embed")
    val mediaEmbed: MediaEmbed? = MediaEmbed(),
    @SerializedName("media_only")
    val mediaOnly: Boolean? = false,
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("no_follow")
    val noFollow: Boolean? = false,
    @SerializedName("num_comments")
    val numComments: Int? = 0,
    @SerializedName("num_crossposts")
    val numCrossposts: Int? = 0,
    @SerializedName("over_18")
    val over18: Boolean? = false,
    @SerializedName("parent_whitelist_status")
    val parentWhitelistStatus: String? = "",
    @SerializedName("permalink")
    val permalink: String? = "",
    @SerializedName("pinned")
    val pinned: Boolean? = false,
    @SerializedName("pwls")
    val pwls: Int? = 0,
    @SerializedName("quarantine")
    val quarantine: Boolean? = false,
    @SerializedName("saved")
    val saved: Boolean? = false,
    @SerializedName("score")
    val score: Int? = 0,
    @SerializedName("secure_media_embed")
    val secureMediaEmbed: SecureMediaEmbed? = SecureMediaEmbed(),
    @SerializedName("selftext")
    val selftext: String? = "",
    @SerializedName("selftext_html")
    val selftextHtml: String? = "",
    @SerializedName("send_replies")
    val sendReplies: Boolean? = false,
    @SerializedName("spoiler")
    val spoiler: Boolean? = false,
    @SerializedName("stickied")
    val stickied: Boolean? = false,
    @SerializedName("subreddit")
    val subreddit: String? = "",
    @SerializedName("subreddit_id")
    val subredditId: String? = "",
    @SerializedName("subreddit_name_prefixed")
    val subredditNamePrefixed: String? = "",
    @SerializedName("subreddit_subscribers")
    val subredditSubscribers: Int? = 0,
    @SerializedName("subreddit_type")
    val subredditType: String? = "",
    @SerializedName("thumbnail")
    val thumbnail: String? = "",
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("total_awards_received")
    val totalAwardsReceived: Int? = 0,
    @SerializedName("ups")
    val ups: Int? = 0,
    @SerializedName("upvote_ratio")
    val upvoteRatio: Double? = 0.0,
    @SerializedName("url")
    val url: String? = "",
    @SerializedName("visited")
    val visited: Boolean? = false,
    @SerializedName("whitelist_status")
    val whitelistStatus: String? = "",
    @SerializedName("wls")
    val wls: Int? = 0
) : Parcelable