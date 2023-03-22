package com.josphat.meowmeowapi.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit




object RetrofitClient {
    fun createRetrofit(baseUrl: String, okHttpClient: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}