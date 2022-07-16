package com.matin.task.model

import com.google.gson.annotations.SerializedName


data class Author (

  @SerializedName("_id"                   ) var Id                    : String?  = null,
  @SerializedName("name"                  ) var name                  : String?  = null,
  @SerializedName("isVerified"            ) var isVerified            : Boolean? = null,
  @SerializedName("language"              ) var language              : String?  = null,
  @SerializedName("createdAt"             ) var createdAt             : String?  = null,
  @SerializedName("updatedAt"             ) var updatedAt             : String?  = null,
  @SerializedName("postCount"             ) var postCount             : Int?     = null,
  @SerializedName("commentCount"          ) var commentCount          : Int?     = null,
  @SerializedName("getLikedCount"         ) var getLikedCount         : Int?     = null,
  @SerializedName("likedPostsCount"       ) var likedPostsCount       : Int?     = null,
  @SerializedName("invitedCount"          ) var invitedCount          : Int?     = null,
  @SerializedName("emailNotificationIsOn" ) var emailNotificationIsOn : Boolean? = null,
  @SerializedName("avatar"                ) var avatar                : String?  = null,
  @SerializedName("userBolckedCount"      ) var userBolckedCount      : Int?     = null,
  @SerializedName("savedPostsCount"       ) var savedPostsCount       : Int?     = null

)