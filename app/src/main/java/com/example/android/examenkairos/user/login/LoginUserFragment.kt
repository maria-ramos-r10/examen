package com.example.android.examenkairos.user.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.android.examenkairos.R
import com.example.android.examenkairos.databinding.FragmentLoginBinding

class LoginUserFragment : Fragment() {

    private lateinit var mBinding: FragmentLoginBinding
    private val loginviewModel: LoginUserViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentLoginBinding.inflate(inflater, container, false)
        mBinding.logViewMod = loginviewModel
        mBinding.lifecycleOwner = viewLifecycleOwner
        return mBinding.root
        //return inflater.inflate(R.layout.fragment_login, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginviewModel.tokenResponce.observe(viewLifecycleOwner){
            Log.i("Debug",it)
        }

        /*mBinding.edtLoginEmail.text
        mBinding.edtLoginPassword.text*/

        val btnRegister = view.findViewById<View>(R.id.btn_register)

        btnRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.registerUser)
        }



    }


}