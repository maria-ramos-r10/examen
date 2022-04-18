package com.example.android.examenkairos.user.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.examenkairos.R


class HomeUserFragment:Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmente_home, container , false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnLoginUserFragment = view.findViewById<View>(R.id.btn_login)

        btnLoginUserFragment.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.loginUser3)
        }

        val btnRegister = view.findViewById<View>(R.id.btn_register)

        btnRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.registerUser)
        }

    }


}
