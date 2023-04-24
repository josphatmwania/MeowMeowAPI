package com.josphat.meowmeowapi.data.api

import com.josphat.meowmeowapi.data.api.model.Cat
import retrofit2.http.GET

interface CatApi {
    @GET(ApiConstants.END_POINTS)
    suspend fun getCat() : List<Cat>



}