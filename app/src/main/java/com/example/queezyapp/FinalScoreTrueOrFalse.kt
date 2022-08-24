package com.example.queezyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.queezyapp.databinding.ActivityFinalScoreBinding
import com.example.queezyapp.databinding.ActivityFinalScoreInternationalBinding
import com.example.queezyapp.databinding.ActivityFinalScoreTrueOrFalseBinding
import com.example.queezyapp.databinding.ActivityTrueOrFalseQuizBinding

class FinalScoreTrueOrFalse : AppCompatActivity() {

    private lateinit var binding: ActivityFinalScoreTrueOrFalseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityFinalScoreTrueOrFalseBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val username = intent.getStringExtra("username").toString()

//        Nav Back Button
        binding.imageView31.setOnClickListener{

            val intent = Intent(this, TrueOrFalseQuiz::class.java)
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

        fun updateUI(username: String) {
            binding.textView44.text = "${username}"
        }

        supportActionBar?.hide()

    }
}