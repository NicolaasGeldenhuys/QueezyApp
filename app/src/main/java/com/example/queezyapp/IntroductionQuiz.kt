package com.example.queezyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IntroductionQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction_quiz)

        supportActionBar?.hide()
    }
}