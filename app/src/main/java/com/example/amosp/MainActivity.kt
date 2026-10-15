package com.example.amosp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewMessage: TextView = findViewById(R.id.textView_PIB)
        val buttonPress: Button = findViewById(R.id.button_PP)

        buttonPress.setOnClickListener {
            textViewMessage.text = "Maksym Zayats"
        }
    }
}