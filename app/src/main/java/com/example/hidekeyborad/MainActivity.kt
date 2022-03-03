package com.example.hidekeyborad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hidekeyborad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editext.requestFocus();

        binding.button.setOnClickListener {
            hideKeyboard();
        }
    }

    private fun hideKeyboard() {
       Log.d("TAG","Not yet implemented")
    }
}