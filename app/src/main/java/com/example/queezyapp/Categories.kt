package com.example.queezyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        supportActionBar?.hide()
    }
}