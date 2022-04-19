package com.example.android.examenkairos.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getInstanceRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://kairos-trainees-api.herokuapp.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}