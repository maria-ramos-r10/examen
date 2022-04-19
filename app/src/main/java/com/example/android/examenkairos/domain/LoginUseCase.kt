package com.example.android.examenkairos.domain

import com.example.android.examenkairos.data.Repository
import com.example.android.examenkairos.data.Token
import com.example.android.examenkairos.data.User

class LoginUseCase {

    val logirepo = Repository ()

    suspend operator fun invoke(user:User): Token {
        return logirepo.loginToken(user)
    }
}