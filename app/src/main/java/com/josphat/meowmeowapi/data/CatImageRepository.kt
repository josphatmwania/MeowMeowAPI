package com.josphat.meowmeowapi.data

import com.josphat.meowmeowapi.api.ApiService
import com.josphat.meowmeowapi.utils.Resource

class CatImageRepository(private  val apiService: ApiService) {
    suspend fun getCatImage(): Resource<CatImage> {
        val response = apiService.getRandomCatImage()

        if (!response.isSuccessful) return Resource.Error(errorMessage = response.message())
        val catImageEntity = mapResponseToEntity(response.body())
        return Resource.Success(data = catImageEntity)


        private fun mapResponseToEntity(catImageResponse: CatImageResponse?) : CatImage{
            return CatImage(
                url= catImageResponse?.message
            )
        }

    }




}