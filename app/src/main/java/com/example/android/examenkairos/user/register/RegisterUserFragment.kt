package com.example.android.examenkairos.user.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.examenkairos.R

class RegisterUserFragment :Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register, container , false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRegister = view.findViewById<View>(R.id.btn_login)

        btnRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.loginUser3)
        }

        val btnRegistrar = view.findViewById<View>(R.id.mbtn_register)

        btnRegistrar.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.myAccounts)
        }
    }

}