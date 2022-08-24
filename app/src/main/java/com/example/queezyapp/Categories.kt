package com.example.queezyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.queezyapp.databinding.ActivityCategoriesBinding
import com.example.queezyapp.databinding.ActivityMainBinding

class Categories : AppCompatActivity() {

    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoriesBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val username = intent.getStringExtra("username").toString()

        binding.imageView14.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        binding.imageView15.setOnClickListener{

            val intent = Intent(this, Settings::class.java)
            startActivity(intent)

        }




//        Navigate to Quizzes

//        Introductory Quiz
        binding.imageView16.setOnClickListener{

            val intent = Intent(this, IntroductionQuiz::class.java)
            startActivity(intent)

            intent.putExtra("username", username.toString())

        }
        binding.imageView19.setOnClickListener{

            val intent = Intent(this, IntroductionQuiz::class.java)
            startActivity(intent)

            intent.putExtra("username", username.toString())

        }

//        International Quiz!
        binding.imageView22.setOnClickListener{

            val intent = Intent(this, InternationalQuiz::class.java)
            startActivity(intent)

            intent.putExtra("username", username.toString())

        }
        binding.imageView21.setOnClickListener{

            val intent = Intent(this, InternationalQuiz::class.java)
            startActivity(intent)

            intent.putExtra("username", username.toString())

        }

        //        True or False Quiz!
        binding.imageView24.setOnClickListener{

            val intent = Intent(this, TrueOrFalseQuiz::class.java)
            startActivity(intent)

            intent.putExtra("username", username.toString())

        }
        binding.imageView25.setOnClickListener{

            val intent = Intent(this, TrueOrFalseQuiz::class.java)
            startActivity(intent)

            intent.putExtra("username", username.toString())

        }



        supportActionBar?.hide()
    }
}