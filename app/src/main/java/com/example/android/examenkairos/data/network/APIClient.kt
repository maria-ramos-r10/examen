package com.example.android.examenkairos.data.network

import com.example.android.examenkairos.data.UserLogin
import com.example.android.examenkairos.data.Token
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface APIClient {

    @POST("auth/user/authenticate/")
    suspend fun postToken(@Body login: UserLogin):Response<Token>
}