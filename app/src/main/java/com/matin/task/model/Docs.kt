package com.matin.task.model

import com.google.gson.annotations.SerializedName
import com.matin.task.model.Author


data class Docs (

    @SerializedName("_id"            ) var Id             : String?          = null,
    @SerializedName("manuType"       ) var manuType       : String?          = null,
    @SerializedName("text"           ) var text           : String?          = null,
    @SerializedName("isReported"     ) var isReported     : Boolean?         = null,
    @SerializedName("createdAt"      ) var createdAt      : String?          = null,
    @SerializedName("updatedAt"      ) var updatedAt      : String?          = null,
    @SerializedName("ownerAnswer"    ) var ownerAnswer    : String?          = null,
    @SerializedName("hasOwnerAnswer" ) var hasOwnerAnswer : Boolean?         = null,
    @SerializedName("status"         ) var status         : String?          = null,
    @SerializedName("isPublished"    ) var isPublished    : Boolean?         = null,
    @SerializedName("publishedAt"    ) var publishedAt    : String?          = null,
    @SerializedName("author"         ) var author         : Author?          = Author(),
    @SerializedName("manufacturer"   ) var manufacturer   : Manufacturer?    = Manufacturer(),
    @SerializedName("media"          ) var media          : ArrayList<Media> = arrayListOf(),
    @SerializedName("likesCount"     ) var likesCount     : Int?             = null,
    @SerializedName("commentCount"   ) var commentCount   : Int?             = null,
    @SerializedName("liked"          ) var liked          : Boolean?         = null,
    @SerializedName("isMyPost"       ) var isMyPost       : Boolean?         = null,
    @SerializedName("isSaved"        ) var isSaved        : Boolean?         = null

)