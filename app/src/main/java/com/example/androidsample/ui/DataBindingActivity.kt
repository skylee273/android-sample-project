package com.example.androidsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.androidsample.R
import com.example.androidsample.databinding.ActivityDataBindingBinding
import com.example.androidsample.model.User

class DataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        binding.user = User("Test", "User", null)
        setContentView(binding.root)
    }

}