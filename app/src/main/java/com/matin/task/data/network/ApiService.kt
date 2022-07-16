package com.matin.task.data.network

import com.matin.task.model.ApiResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class Api {

    companion object {

        var BASE_URL = "https://evolute-test-db.herokuapp.com/api/"

        private val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        fun create() : ApiService {
            return retrofit.create(ApiService::class.java)
        }
    }
}

interface ApiService {
    @GET("feed/")
    suspend fun getFeeds(
        @Query("page") page: Int,
        @Query("limit") limit: Int,
    ) : ApiResponse
}