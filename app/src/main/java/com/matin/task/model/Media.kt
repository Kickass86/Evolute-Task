package com.matin.task.model

import com.google.gson.annotations.SerializedName


data class Media (

  @SerializedName("_id"       ) var Id        : String? = null,
  @SerializedName("mediaType" ) var mediaType : String? = null,
  @SerializedName("url"       ) var url       : String? = null

)