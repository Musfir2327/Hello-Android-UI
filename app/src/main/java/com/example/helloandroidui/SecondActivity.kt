package com.example.helloandroidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondpage)

        val backButton = findViewById<Button>(R.id.button3)
        backButton.setOnClickListener {
            finish() // go back to MainActivity
        }
    }
}
