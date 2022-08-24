package com.example.queezyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.queezyapp.databinding.ActivityCategoriesBinding
import com.example.queezyapp.databinding.ActivityFinalScoreBinding

class FinalScore : AppCompatActivity() {

    private lateinit var binding: ActivityFinalScoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityFinalScoreBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val username = intent.getStringExtra("username").toString()

//        TODO Figure out how to push username to show on results page!
        fun updateUI(username: String) {
            binding.textView42.text = "${username}"
        }

        updateUI(username)

//N A V I G A T I O N
//        Nav Back Button
        binding.imageView31.setOnClickListener{
            val intent = Intent(this, IntroductionQuiz::class.java)
            startActivity(intent)
        }

//        Nav Settings
        binding.imageView32.setOnClickListener{
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
        //        Nav Home
        binding.button4.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //        Nav Categories
        binding.button3.setOnClickListener{
            val intent = Intent(this, Categories::class.java)
            startActivity(intent)
        }
//        N A V I G A T I O N  D O N E



        supportActionBar?.hide()
    }
}