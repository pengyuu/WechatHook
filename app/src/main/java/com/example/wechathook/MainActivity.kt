package com.example.wechathook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import de.robv.android.xposed.XposedHelpers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
