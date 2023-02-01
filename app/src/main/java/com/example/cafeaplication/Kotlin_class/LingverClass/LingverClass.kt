package com.example.cafeaplication.Kotlin_class.LingverClass

import android.app.Application
import com.yariksoffice.lingver.Lingver

class LingverClass : Application() {
    override fun onCreate() {
        super.onCreate()
        Lingver.init(this)
    }
}