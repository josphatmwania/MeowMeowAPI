package com.josphat.meowmeowapi.api

import com.josphat.meowmeowapi.data.CatImageResponse
import okhttp3.Response
import retrofit2.http.GET

interface ApiService {
    @GET("api/https://api.thecatapi.com/v1/images/search?limit=1")
    suspend fun getRandomCatImage(): Response<CatImageResponse>
}