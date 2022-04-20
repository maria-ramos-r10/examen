package com.example.android.examenkairos.user.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.examenkairos.data.UserLogin
import com.example.android.examenkairos.domain.LoginUseCase
import kotlinx.coroutines.launch

class LoginUserViewModel : ViewModel() {

    private val _tokenResponse = MutableLiveData<String>()

    val tokenResponce: LiveData<String> get() = _tokenResponse

    val loginUseCase = LoginUseCase()

    // caso de uso
    fun logUser() {
        viewModelScope.launch {
            val user = UserLogin("prueba@yopmail.com", "asdfg")
            val response = loginUseCase(user)
            _tokenResponse.value = response.token
        }
    }

}