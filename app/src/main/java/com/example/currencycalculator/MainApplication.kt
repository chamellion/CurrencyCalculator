package com.example.currencycalculator

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.*

@HiltAndroidApp
class MainApplication: Application() {


    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG){
            Timber.plant(DebugTree())
        }
    }
}