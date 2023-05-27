package com.example.androidsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidsample.databinding.ResultProfileBinding

class ResultProfileActivity : AppCompatActivity() {

    private lateinit var binding: ResultProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ResultProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    private fun init() {
        binding.name.text = ""
        binding.button.setOnClickListener{

        }
    }


}