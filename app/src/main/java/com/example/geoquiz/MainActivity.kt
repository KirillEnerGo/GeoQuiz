package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.geoquiz.databinding.ActivityMainBinding

/*class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)*/
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener { view: View ->
            Toast.makeText(this,
                "Верно! ",
                Toast.LENGTH_SHORT)
                .show()
        }

        binding.falseButton.setOnClickListener { view: View ->
            Toast.makeText(this,
                "Не верно! ",
                Toast.LENGTH_SHORT)
                .show()
        }


    }
}