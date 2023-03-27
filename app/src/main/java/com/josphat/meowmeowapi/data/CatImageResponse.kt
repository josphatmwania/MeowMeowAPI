package com.josphat.meowmeowapi.data
import com.google.gson.annotations.SerializedName


data class CatImageResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String

)