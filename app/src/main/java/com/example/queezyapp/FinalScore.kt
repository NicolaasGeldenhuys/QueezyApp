package com.example.queezyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FinalScore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_score)

        supportActionBar?.hide()
    }
}