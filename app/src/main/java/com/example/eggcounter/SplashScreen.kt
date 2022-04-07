package com.example.eggcounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.eggcounter.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       binding.btngetstarted.setOnClickListener{
//           Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
           val intent = Intent(this,MainActivity::class.java)
           startActivity(intent)
       }

    }
}