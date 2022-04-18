package com.example.android.examenkairos.user.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.examenkairos.MainActivity
import com.example.android.examenkairos.R
import com.example.android.examenkairos.User
import com.example.android.examenkairos.databinding.FragmentLoginBinding

class LoginUserFragment : Fragment() {

    private lateinit var mBinding: FragmentLoginBinding

    private var mActivity: MainActivity? = null
    private var mIsEditMode: Boolean = false
    private var mUser: User? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentLoginBinding.inflate(inflater, container, false)

        return mBinding.root
        //return inflater.inflate(R.layout.fragment_login, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnRegister = view.findViewById<View>(R.id.btn_register)

        btnRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.registerUser)
        }

    }


}