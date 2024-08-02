package com.dicoding.tourismapp

import android.app.Application
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import dagger.hilt.android.HiltAndroidApp
import java.util.Locale

@HiltAndroidApp
open class MyApplication : Application() {
//    override fun getApplicationContext(): Context {
//        return super.getApplicationContext().updateContextResources()
//    }
//
//    fun Context.updateContextResources(): Context {
//        Locale.setDefault(localeFromPreferences)
//        val locale = Locale.getDefault()
//
//        if (currentLocale == locale && this is Application) {
//            return this
//        }
//
//        val resources = resources
//        val configuration = resources.configuration
//        configuration?.setLocale(locale)
//
//        configuration?.setLayoutDirection(locale)
//
//        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N && this !is Application) {
//            createConfigurationContext(configuration)
//        } else {
//            @Suppress("DEPRECATION")
//            resources.updateConfiguration(configuration, resources.displayMetrics)
//            this
//        }
//    }
//    private val coreComponent: CoreComponent by lazy {
//        DaggerCoreComponent.factory().create(applicationContext)
//    }
//
//    val appComponent: AppComponent by lazy {
//        DaggerAppComponent.factory().create(coreComponent)
//    }
}