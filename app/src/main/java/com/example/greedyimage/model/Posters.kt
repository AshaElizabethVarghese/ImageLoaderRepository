package com.example.kotlindemo.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Child {
    @SerializedName("kind")
    @Expose
    var kind: String? = null

    @SerializedName("data")
    @Expose
    var data: Data_? = null

}
class Data {
    @SerializedName("modhash")
    @Expose
    var modhash: String? = null

    @SerializedName("dist")
    @Expose
    var dist: Int? = null

    @SerializedName("children")
    @Expose
    var children: List<Child>? = null

    @SerializedName("after")
    @Expose
    var after: String? = null

    @SerializedName("before")
    @Expose
    var before: Any? = null

}
class Data_() : Parcelable{
    @SerializedName("approved_at_utc")
    @Expose
    var approvedAtUtc: Any? = null

    @SerializedName("subreddit")
    @Expose
    var subreddit: String? = null

    @SerializedName("selftext")
    @Expose
    var selftext: String? = null

    @SerializedName("author_fullname")
    @Expose
    var authorFullname: String? = null

    @SerializedName("saved")
    @Expose
    var saved: Boolean? = null

    @SerializedName("mod_reason_title")
    @Expose
    var modReasonTitle: Any? = null

    @SerializedName("gilded")
    @Expose
    var gilded: Int? = null

    @SerializedName("clicked")
    @Expose
    var clicked: Boolean? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("link_flair_richtext")
    @Expose
    var linkFlairRichtext: List<LinkFlairRichtext>? = null

    @SerializedName("subreddit_name_prefixed")
    @Expose
    var subredditNamePrefixed: String? = null

    @SerializedName("hidden")
    @Expose
    var hidden: Boolean? = null

    @SerializedName("pwls")
    @Expose
    var pwls: Int? = null

    @SerializedName("link_flair_css_class")
    @Expose
    var linkFlairCssClass: String? = null

    @SerializedName("downs")
    @Expose
    var downs: Int? = null

    @SerializedName("thumbnail_height")
    @Expose
    var thumbnailHeight: Int? = null

    @SerializedName("top_awarded_type")
    @Expose
    var topAwardedType: Any? = null

    @SerializedName("hide_score")
    @Expose
    var hideScore: Boolean? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("quarantine")
    @Expose
    var quarantine: Boolean? = null

    @SerializedName("link_flair_text_color")
    @Expose
    var linkFlairTextColor: String? = null

    @SerializedName("upvote_ratio")
    @Expose
    var upvoteRatio: Double? = null

    @SerializedName("author_flair_background_color")
    @Expose
    var authorFlairBackgroundColor: Any? = null

    @SerializedName("subreddit_type")
    @Expose
    var subredditType: String? = null

    @SerializedName("ups")
    @Expose
    var ups: Int? = null

    @SerializedName("total_awards_received")
    @Expose
    var totalAwardsReceived: Int? = null

    @SerializedName("media_embed")
    @Expose
    var mediaEmbed: MediaEmbed? = null

    @SerializedName("thumbnail_width")
    @Expose
    var thumbnailWidth: Int? = null

    @SerializedName("author_flair_template_id")
    @Expose
    var authorFlairTemplateId: Any? = null

    @SerializedName("is_original_content")
    @Expose
    var isOriginalContent: Boolean? = null

    @SerializedName("user_reports")
    @Expose
    var userReports: List<Any>? = null

    @SerializedName("secure_media")
    @Expose
    var secureMedia: Any? = null

    @SerializedName("is_reddit_media_domain")
    @Expose
    var isRedditMediaDomain: Boolean? = null

    @SerializedName("is_meta")
    @Expose
    var isMeta: Boolean? = null

    @SerializedName("category")
    @Expose
    var category: Any? = null

    @SerializedName("secure_media_embed")
    @Expose
    var secureMediaEmbed: SecureMediaEmbed? = null

    @SerializedName("link_flair_text")
    @Expose
    var linkFlairText: String? = null

    @SerializedName("can_mod_post")
    @Expose
    var canModPost: Boolean? = null

    @SerializedName("score")
    @Expose
    var score: Int? = null

    @SerializedName("approved_by")
    @Expose
    var approvedBy: Any? = null

    @SerializedName("author_premium")
    @Expose
    var authorPremium: Boolean? = null

    @SerializedName("thumbnail")
    @Expose
    var thumbnail: String? = null

    @SerializedName("edited")
    @Expose
    var edited: Boolean? = null

    @SerializedName("author_flair_css_class")
    @Expose
    var authorFlairCssClass: Any? = null

    @SerializedName("author_flair_richtext")
    @Expose
    var authorFlairRichtext: List<Any>? = null

    @SerializedName("gildings")
    @Expose
    var gildings: Gildings? = null

    @SerializedName("post_hint")
    @Expose
    var postHint: String? = null

    @SerializedName("content_categories")
    @Expose
    var contentCategories: Any? = null

    @SerializedName("is_self")
    @Expose
    var isSelf: Boolean? = null

    @SerializedName("mod_note")
    @Expose
    var modNote: Any? = null

    @SerializedName("created")
    @Expose
    var created: Double? = null

    @SerializedName("link_flair_type")
    @Expose
    var linkFlairType: String? = null

    @SerializedName("wls")
    @Expose
    var wls: Int? = null

    @SerializedName("removed_by_category")
    @Expose
    var removedByCategory: Any? = null

    @SerializedName("banned_by")
    @Expose
    var bannedBy: Any? = null

    @SerializedName("author_flair_type")
    @Expose
    var authorFlairType: String? = null

    @SerializedName("domain")
    @Expose
    var domain: String? = null

    @SerializedName("allow_live_comments")
    @Expose
    var allowLiveComments: Boolean? = null

    @SerializedName("selftext_html")
    @Expose
    var selftextHtml: Any? = null

    @SerializedName("likes")
    @Expose
    var likes: Any? = null

    @SerializedName("suggested_sort")
    @Expose
    var suggestedSort: Any? = null

    @SerializedName("banned_at_utc")
    @Expose
    var bannedAtUtc: Any? = null

    @SerializedName("view_count")
    @Expose
    var viewCount: Any? = null

    @SerializedName("archived")
    @Expose
    var archived: Boolean? = null

    @SerializedName("no_follow")
    @Expose
    var noFollow: Boolean? = null

    @SerializedName("is_crosspostable")
    @Expose
    var isCrosspostable: Boolean? = null

    @SerializedName("pinned")
    @Expose
    var pinned: Boolean? = null

    @SerializedName("over_18")
    @Expose
    var over18: Boolean? = null

    @SerializedName("preview")
    @Expose
    var preview: Preview? = null

    @SerializedName("all_awardings")
    @Expose
    var allAwardings: List<Any>? = null

    @SerializedName("awarders")
    @Expose
    var awarders: List<Any>? = null

    @SerializedName("media_only")
    @Expose
    var mediaOnly: Boolean? = null

    @SerializedName("link_flair_template_id")
    @Expose
    var linkFlairTemplateId: String? = null

    @SerializedName("can_gild")
    @Expose
    var canGild: Boolean? = null

    @SerializedName("spoiler")
    @Expose
    var spoiler: Boolean? = null

    @SerializedName("locked")
    @Expose
    var locked: Boolean? = null

    @SerializedName("author_flair_text")
    @Expose
    var authorFlairText: Any? = null

    @SerializedName("treatment_tags")
    @Expose
    var treatmentTags: List<Any>? = null

    @SerializedName("visited")
    @Expose
    var visited: Boolean? = null

    @SerializedName("removed_by")
    @Expose
    var removedBy: Any? = null

    @SerializedName("num_reports")
    @Expose
    var numReports: Any? = null

    @SerializedName("distinguished")
    @Expose
    var distinguished: Any? = null

    @SerializedName("subreddit_id")
    @Expose
    var subredditId: String? = null

    @SerializedName("mod_reason_by")
    @Expose
    var modReasonBy: Any? = null

    @SerializedName("removal_reason")
    @Expose
    var removalReason: Any? = null

    @SerializedName("link_flair_background_color")
    @Expose
    var linkFlairBackgroundColor: String? = null

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("is_robot_indexable")
    @Expose
    var isRobotIndexable: Boolean? = null

    @SerializedName("report_reasons")
    @Expose
    var reportReasons: Any? = null

    @SerializedName("author")
    @Expose
    var author: String? = null

    @SerializedName("discussion_type")
    @Expose
    var discussionType: Any? = null

    @SerializedName("num_comments")
    @Expose
    var numComments: Int? = null

    @SerializedName("send_replies")
    @Expose
    var sendReplies: Boolean? = null

    @SerializedName("whitelist_status")
    @Expose
    var whitelistStatus: String? = null

    @SerializedName("contest_mode")
    @Expose
    var contestMode: Boolean? = null

    @SerializedName("mod_reports")
    @Expose
    var modReports: List<Any>? = null

    @SerializedName("author_patreon_flair")
    @Expose
    var authorPatreonFlair: Boolean? = null

    @SerializedName("author_flair_text_color")
    @Expose
    var authorFlairTextColor: Any? = null

    @SerializedName("permalink")
    @Expose
    var permalink: String? = null

    @SerializedName("parent_whitelist_status")
    @Expose
    var parentWhitelistStatus: String? = null

    @SerializedName("stickied")
    @Expose
    var stickied: Boolean? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("subreddit_subscribers")
    @Expose
    var subredditSubscribers: Int? = null

    @SerializedName("created_utc")
    @Expose
    var createdUtc: Double? = null

    @SerializedName("num_crossposts")
    @Expose
    var numCrossposts: Int? = null

    @SerializedName("media")
    @Expose
    var media: Any? = null

    @SerializedName("is_video")
    @Expose
    var isVideo: Boolean? = null

    constructor(parcel: Parcel) : this() {
        subreddit = parcel.readString()
        selftext = parcel.readString()
        authorFullname = parcel.readString()
        saved = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        gilded = parcel.readValue(Int::class.java.classLoader) as? Int
        clicked = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        title = parcel.readString()
        subredditNamePrefixed = parcel.readString()
        hidden = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        pwls = parcel.readValue(Int::class.java.classLoader) as? Int
        linkFlairCssClass = parcel.readString()
        downs = parcel.readValue(Int::class.java.classLoader) as? Int
        thumbnailHeight = parcel.readValue(Int::class.java.classLoader) as? Int
        hideScore = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        name = parcel.readString()
        quarantine = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        linkFlairTextColor = parcel.readString()
        upvoteRatio = parcel.readValue(Double::class.java.classLoader) as? Double
        subredditType = parcel.readString()
        ups = parcel.readValue(Int::class.java.classLoader) as? Int
        totalAwardsReceived = parcel.readValue(Int::class.java.classLoader) as? Int
        thumbnailWidth = parcel.readValue(Int::class.java.classLoader) as? Int
        isOriginalContent = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        isRedditMediaDomain = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        isMeta = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        linkFlairText = parcel.readString()
        canModPost = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        score = parcel.readValue(Int::class.java.classLoader) as? Int
        authorPremium = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        thumbnail = parcel.readString()
        edited = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        postHint = parcel.readString()
        isSelf = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        created = parcel.readValue(Double::class.java.classLoader) as? Double
        linkFlairType = parcel.readString()
        wls = parcel.readValue(Int::class.java.classLoader) as? Int
        authorFlairType = parcel.readString()
        domain = parcel.readString()
        allowLiveComments = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        archived = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        noFollow = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        isCrosspostable = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        pinned = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        over18 = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        mediaOnly = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        linkFlairTemplateId = parcel.readString()
        canGild = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        spoiler = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        locked = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        visited = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        subredditId = parcel.readString()
        linkFlairBackgroundColor = parcel.readString()
        id = parcel.readString()
        isRobotIndexable = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        author = parcel.readString()
        numComments = parcel.readValue(Int::class.java.classLoader) as? Int
        sendReplies = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        whitelistStatus = parcel.readString()
        contestMode = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        authorPatreonFlair = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        permalink = parcel.readString()
        parentWhitelistStatus = parcel.readString()
        stickied = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        url = parcel.readString()
        subredditSubscribers = parcel.readValue(Int::class.java.classLoader) as? Int
        createdUtc = parcel.readValue(Double::class.java.classLoader) as? Double
        numCrossposts = parcel.readValue(Int::class.java.classLoader) as? Int
        isVideo = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Data_> {
        override fun createFromParcel(parcel: Parcel): Data_ {
            return Data_(parcel)
        }

        override fun newArray(size: Int): Array<Data_?> {
            return arrayOfNulls(size)
        }
    }

}

class Gildings {

}

class SecureMediaEmbed {

}

class MediaEmbed {

}

class Posters {
    @SerializedName("kind")
    @Expose
    var kind: String? = null

    @SerializedName("data")
    @Expose
    var data: Data? = null

}
class Image {
    @SerializedName("source")
    @Expose
    var source: Source? = null

    @SerializedName("resolutions")
    @Expose
    var resolutions: List<Resolution>? = null

    @SerializedName("variants")
    @Expose
    var variants: Variants? = null

    @SerializedName("id")
    @Expose
    var id: String? = null

}

class Variants {

}

class LinkFlairRichtext {
    @SerializedName("e")
    @Expose
    var e: String? = null

    @SerializedName("t")
    @Expose
    var t: String? = null

}
class Preview {
    @SerializedName("images")
    @Expose
    var images: List<Image>? = null

    @SerializedName("enabled")
    @Expose
    var enabled: Boolean? = null

}
class Resolution {
    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("width")
    @Expose
    var width: Int? = null

    @SerializedName("height")
    @Expose
    var height: Int? = null

}
class Source {
    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("width")
    @Expose
    var width: Int? = null

    @SerializedName("height")
    @Expose
    var height: Int? = null

}