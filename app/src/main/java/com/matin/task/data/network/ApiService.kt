package com.matin.task.data.network

import com.matin.task.model.ApiResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class ApiService {

    companion object {

        var BASE_URL = "https://evolute-test-db.herokuapp.com/api/"

        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}

interface ApiInterface {
    @GET("feed/")
    fun getFeeds(
        @Query("page") page: Int,
        @Query("limit") limit: Int,
    ) : ApiResponse
}