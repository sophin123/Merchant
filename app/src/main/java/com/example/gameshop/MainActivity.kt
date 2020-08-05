package com.example.gameshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), NavigationHost {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mer_activity_main)

        if(savedInstanceState == null){
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, LoginFragment())
                    .commit()
        }
    }

    override fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        val transaction: FragmentTransaction = supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment)

        if (addToBackstack){
            transaction.addToBackStack(null)
        }

        transaction.commit()


    }

}