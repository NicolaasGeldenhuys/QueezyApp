package com.example.queezyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.queezyapp.databinding.ActivityCategoriesBinding
import com.example.queezyapp.databinding.ActivityInternationalQuizBinding
import com.example.queezyapp.databinding.ActivityIntroductionQuizBinding

private lateinit var binding: ActivityIntroductionQuizBinding

class IntroductionQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntroductionQuizBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val username = intent.getStringExtra("username").toString()




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

            val intent = Intent(this, FinalScore::class.java)
            startActivity(intent)

//            Push Username to results screen
            intent.putExtra("username",username)
        }



        supportActionBar?.hide()
    }
}