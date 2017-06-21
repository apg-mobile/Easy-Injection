package com.apg.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.apg.kotlin.library.EasyInjection
import com.apg.kotlin.library.stringPref

class MainActivity : AppCompatActivity() {

    var stringaaaaa by stringPref()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EasyInjection.init(this)
        Log.e("bankTest", "stringaaaa: $stringaaaaa")
        stringaaaaa = "siwarat"
        Log.e("bankTest", "stringaaaa: $stringaaaaa")
    }
}
