package com.androiddevs.mvvmnewsapp.api

import com.androiddevs.mvvmnewsapp.models.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    companion object {
        const val BASE_URL = "https://newsapi.org/"
        // const val API_KEY = ""
    }

    // For Breaking News Request
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "us",
        @Query("page") pageNumber: Int = 1
        //@Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>

    // For Search News Request
    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("page") pageNumber: Int = 1
        //@Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>
}