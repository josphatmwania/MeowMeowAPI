package com.josphat.meowmeowapi.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Cat(
    @Json(name = "breeds")
    val breeds: List<Any>,
    @Json(name = "favourite")
    val favourite: Favourite,
    @Json(name = "height")
    val height: Int,
    @Json(name = "id")
    val id: String,
    @Json(name = "url")
    val url: String,
    @Json(name = "width")
    val width: Int
)