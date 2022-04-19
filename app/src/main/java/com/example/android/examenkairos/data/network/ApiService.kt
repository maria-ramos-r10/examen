package com.example.android.examenkairos.data.network

import com.example.android.examenkairos.data.User
import com.example.android.examenkairos.core.RetrofitHelper
import com.example.android.examenkairos.data.Token
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ApiService {

    private  val instanceRefactoryHelper = RetrofitHelper.getInstanceRetrofit()

    suspend fun getToken(user: User): Token {
        return withContext(Dispatchers.IO){
            val response = instanceRefactoryHelper.create(APIClient::class.java).postToken(user)
            response.body() ?: Token("Error")
        }
    }

}