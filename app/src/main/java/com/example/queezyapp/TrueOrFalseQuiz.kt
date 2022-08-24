package com.example.queezyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.queezyapp.databinding.ActivityCategoriesBinding
import com.example.queezyapp.databinding.ActivityInternationalQuizBinding
import com.example.queezyapp.databinding.ActivityTrueOrFalseQuizBinding

private lateinit var binding: ActivityTrueOrFalseQuizBinding

class TrueOrFalseQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTrueOrFalseQuizBinding.inflate(layoutInflater)

        setContentView(binding.root)


        //  Navigation for back button
        binding.imageView13.setOnClickListener{

            val intent = Intent(this, Categories::class.java)
            startActivity(intent)

        }

        //  Navigation for settings
        binding.imageView17.setOnClickListener{

            val intent = Intent(this, Settings::class.java)
            startActivity(intent)

        }

        //  Navigation for Submit Button
        binding.button.setOnClickListener{

            val intent = Intent(this, FinalScoreTrueOrFalse::class.java)
            startActivity(intent)

        }

        supportActionBar?.hide()

    }
}