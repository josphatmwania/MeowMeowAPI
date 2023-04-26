package com.josphat.meowmeowapi.di

import com.josphat.meowmeowapi.data.api.ApiConstants
import com.josphat.meowmeowapi.data.api.CatApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CatApiModule {

    @Provides
    @Singleton
    fun provideApi(builder: Retrofit.Builder): CatApi{
        return builder
            .build()
            .create(CatApi::class.java)

    }

    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
    }



}