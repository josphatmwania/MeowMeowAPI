package com.josphat.meowmeowapi.data.repository

import com.josphat.meowmeowapi.data.api.CatApi
import com.josphat.meowmeowapi.data.api.model.Cat
import javax.inject.Inject

class CatRepo @Inject constructor(
    private val catApi: CatApi
) {

    suspend fun getCat(): List<Cat>{
        return catApi.getCat()
    }



}