package com.example.android.examenkairos.account.listaccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.examenkairos.databinding.FragmentMyAccountsBinding

class MyAccountsFragment:Fragment() {

    private lateinit var binding: FragmentMyAccountsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyAccountsBinding.inflate(inflater)
        return binding.root
    }

}