package com.example.queezyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.queezyapp.databinding.ActivityFinalScoreBinding
import com.example.queezyapp.databinding.ActivityFinalScoreInternationalBinding

class FinalScoreInternational : AppCompatActivity() {

    private lateinit var binding: ActivityFinalScoreInternationalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityFinalScoreInternationalBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        Nav Back Button
        binding.imageView31.setOnClickListener{

            val intent = Intent(this, InternationalQuiz::class.java)
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

    }
}