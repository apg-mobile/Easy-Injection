package com.apg.kotlin

import android.app.Application
import com.apg.kotlin.library.EasyInjection

/**
 * Created by siwarats on 21/6/2560.
 */

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        EasyInjection.init(this)
    }
}