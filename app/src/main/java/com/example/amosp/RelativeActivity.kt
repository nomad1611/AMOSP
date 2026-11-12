package com.example.amosp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        // Обробка натискання кнопки "Назад"
        val btnBack = findViewById<Button>(R.id.btnBackRelative)
        btnBack.setOnClickListener {
            finish() // Повернення на MainActivity
        }

        val editTextEntry = findViewById<EditText>(R.id.entry)
        val buttonOk = findViewById<Button>(R.id.ok)
        val buttonCancel = findViewById<Button>(R.id.cancel)

        buttonOk.setOnClickListener {
            val inputText = editTextEntry.text.toString()
            if (inputText.isNotEmpty()) {
                Toast.makeText(this, "Введений текст: $inputText", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Будь ласка, введіть текст", Toast.LENGTH_SHORT).show()
            }
        }

        buttonCancel.setOnClickListener {
            editTextEntry.text.clear()
        }
    }
}