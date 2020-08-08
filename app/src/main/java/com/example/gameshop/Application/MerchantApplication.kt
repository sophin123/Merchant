package com.example.gameshop.Application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class MerchantApplication : Application(){
    companion object{
        lateinit var instance: MerchantApplication
        private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

    }

}