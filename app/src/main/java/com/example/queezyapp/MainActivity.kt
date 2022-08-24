package com.example.queezyapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.inputmethod.InputBinding
import android.widget.EditText
import androidx.viewpager2.widget.ViewPager2
import com.example.queezyapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setupTabBar()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button2.setOnClickListener {

            val username = binding.editTextTextPersonName.text

            if(username.toString() == ""){

                var snackbar =  Snackbar.make(it, "Please enter your name", Snackbar.LENGTH_LONG)
                snackbar.setAction("Ok") {
                    Log.i("Ok Snackbar", "Yes!")
                }
                snackbar.show()


                binding.editTextTextPersonName.error = "Please add your username"

        } else {
                Log.i("Clicked","$username")

//Intent navigation (context from where intent happens, and where current activity should go to new one)
                val intent = Intent(this, Categories::class.java)

                startActivity(intent)

            }
        }


//        Add navigation to settings

        binding.imageView5.setOnClickListener{

            val intent = Intent(this, Settings::class.java)
            startActivity(intent)

        }

//        Bottom Navigation

//        binding.playNav.setOnClickListener{
//
//            val intent = Intent(this, Categories::class.java)
//            startActivity(intent)
//
//        }
//
//        binding.homeNav.setOnClickListener{
//
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//
//        }
//
//        binding.scoreNav.setOnClickListener{
//
//            val intent = Intent(this, FinalScore::class.java)
//            startActivity(intent)
//
//        }



        supportActionBar?.hide()
    }


}