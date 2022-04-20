package com.example.android.examenkairos.domain

import com.example.android.examenkairos.data.Repository
import com.example.android.examenkairos.data.Token
import com.example.android.examenkairos.data.UserLogin

class LoginUseCase {

    val logirepo = Repository ()

    suspend operator fun invoke(user:UserLogin): Token {
        return logirepo.loginToken(user)
    }
}