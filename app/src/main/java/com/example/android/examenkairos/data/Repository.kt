package com.example.android.examenkairos.data

import com.example.android.examenkairos.data.network.ApiService

class Repository {

    private val api = ApiService()

    suspend fun loginToken(user: User):Token {
        val respuesta = api.getToken(user)
        return respuesta
    }
}