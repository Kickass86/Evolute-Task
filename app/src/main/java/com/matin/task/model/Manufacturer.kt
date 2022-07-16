package com.matin.task.model

import com.google.gson.annotations.SerializedName


data class Manufacturer (

  @SerializedName("_id"            ) var Id             : String?           = null,
  @SerializedName("language"       ) var language       : String?           = null,
  @SerializedName("name"           ) var name           : String?           = null,
  @SerializedName("isPartner"      ) var isPartner      : Boolean?          = null,
  @SerializedName("categories"     ) var categories     : ArrayList<String> = arrayListOf(),
  @SerializedName("createdAt"      ) var createdAt      : String?           = null,
  @SerializedName("followersCount" ) var followersCount : Int?              = null,
  @SerializedName("isSubscribed"   ) var isSubscribed   : Boolean?          = null

)