package com.matin.task.model

import com.google.gson.annotations.SerializedName


data class ApiResponse (

  @SerializedName("limit"   ) var limit   : Int?            = null,
  @SerializedName("total"   ) var total   : Int?            = null,
  @SerializedName("hasMore" ) var hasMore : Boolean?        = null,
  @SerializedName("docs"    ) var docs    : ArrayList<Docs> = arrayListOf()

)