package com.example.android.examenkairos

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.android.examenkairos.account.listaccount.MyAccountsFragment
import com.example.android.examenkairos.account.requestaccount.RequestCardFragment
import com.example.android.examenkairos.databinding.ActivityMainBinding
import com.example.android.examenkairos.user.home.HomeUserFragment
import com.example.android.examenkairos.user.login.LoginUserFragment
import com.example.android.examenkairos.user.register.RegisterUserFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var mBindign: ActivityMainBinding
    private lateinit var mActiveFragment: Fragment
    private lateinit var mFragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBindign = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBindign.root)
        //setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        mFragmentManager = supportFragmentManager

        val homeUser = HomeUserFragment()
        val loginUser = LoginUserFragment()
        val registerUser = RegisterUserFragment()
        val myAccounts = MyAccountsFragment()
        val requestCard = RequestCardFragment()

        mActiveFragment = homeUser

        mFragmentManager.beginTransaction()
            .add(R.id.host_fragment, requestCard, RequestCardFragment::class.java.name)
            .hide(requestCard).commit()
        mFragmentManager.beginTransaction()
            .add(R.id.host_fragment, myAccounts, MyAccountsFragment::class.java.name)
            .hide(myAccounts).commit()
        mFragmentManager.beginTransaction()
            .add(R.id.host_fragment, registerUser, RegisterUserFragment::class.java.name)
            .hide(registerUser).commit()
        mFragmentManager.beginTransaction()
            .add(R.id.host_fragment, loginUser, LoginUserFragment::class.java.name)
            .hide(loginUser).commit()
        mFragmentManager.beginTransaction()
            .add(R.id.host_fragment, homeUser, HomeUserFragment::class.java.name)
            .hide(homeUser).commit()

        when (item.itemId) {
            R.id.myAccounts -> {
                mFragmentManager.beginTransaction().hide(mActiveFragment).show(myAccounts).commit()
                mActiveFragment = myAccounts
                true
            }
            R.id.requestCard -> {
                mFragmentManager.beginTransaction().hide(mActiveFragment).show(requestCard).commit()
                mActiveFragment = requestCard
                true
            }
            R.id.nav_log_out -> {
                mFragmentManager.beginTransaction().hide(mActiveFragment).show(homeUser).commit()
                mActiveFragment = homeUser
                true
            }
            else-> false
        }
        // drawer.closeDrawer(GravityCompat.START)
        return true
    }


}