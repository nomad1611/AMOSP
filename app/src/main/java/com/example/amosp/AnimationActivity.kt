package com.example.amosp

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        // Обробка натискання кнопки "Назад"
        val btnBack = findViewById<Button>(R.id.btnBackAnimation)
        btnBack.setOnClickListener {
            finish() // Повернення на MainActivity
        }

        // Запуск анімації
        val ship = findViewById<ImageView>(R.id.shipView)
        val shipAnim = AnimationUtils.loadAnimation(this, R.anim.ship_anim)
        ship.startAnimation(shipAnim)
    }
}