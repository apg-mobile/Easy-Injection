package com.apg.kotlin.library

import android.content.Context

/**
 * Created by siwarats on 21/6/2560.
 */
object EasyInjection {
    internal lateinit var context: Context

    var mode: Int = Context.MODE_PRIVATE

    fun init(context: Context) {
        EasyInjection.context = context
    }
}