package com.example.queezyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        supportActionBar?.hide()
    }
}