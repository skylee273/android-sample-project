package com.example.androidsample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidsample.databinding.ActivityMainBinding
import com.example.androidsample.ui.DataBindingActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDatabinding.setOnClickListener(this)

        // test
    }

    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.btn_databinding -> {
                val dataBindingIntent = Intent(applicationContext, DataBindingActivity::class.java)
                startActivity(dataBindingIntent)
            }
        }
    }
}
