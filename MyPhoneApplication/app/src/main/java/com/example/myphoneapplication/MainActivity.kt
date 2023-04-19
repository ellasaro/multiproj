package com.example.myphoneapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibraryproject.TestDataClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataClass = TestDataClass()
    }
}