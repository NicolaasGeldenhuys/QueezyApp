package com.example.queezyapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.inputmethod.InputBinding
import android.widget.EditText
import com.example.queezyapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
            }
        }



        supportActionBar?.hide()
    }
}