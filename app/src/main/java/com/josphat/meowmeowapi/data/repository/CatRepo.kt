package com.josphat.meowmeowapi.data.repository

import android.telecom.Call
import android.util.Log
import com.josphat.meowmeowapi.data.api.CatApi
import com.josphat.meowmeowapi.data.api.model.Cat
import javax.inject.Inject

class CatRepo @Inject constructor(
    private val catApi: CatApi
) {

    suspend fun getCat(): List<Cat>{
        return catApi.getCat()
    }


//    override fun onFailure(call: Call<List<Cat>>, t; Throwable) {
//        Log.e("CatViewModel", "Error fetching Cat Images ${t.localizedMessage}")
//
//    }


}