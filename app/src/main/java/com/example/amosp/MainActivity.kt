package com.example.amosp


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show()

        val textViewMessage: TextView = findViewById(R.id.textView_PIB)
        val buttonPress: Button = findViewById(R.id.button_PP)
        val Menu_list: Spinner = findViewById(R.id.spinner_menu)

        ArrayAdapter.createFromResource(
            this,
            R.array.string_array_menu,
            android.R.layout.simple_spinner_item).also { adapter ->
            // Specify the layout to use when the list of choices appears.
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner.
            Menu_list.adapter = adapter
            }

        Menu_list.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: android.view.View?, position: Int, id: Long) {
                // position == 0: Task 1: Animation
                // position == 1: Task 2: Flags (поточний екран, нічого не робимо)
                // position == 2: Task 3: Relative Layout

                when (position) {
                    0 -> {

                    }
                    1 -> {
                        // Перехід на екран анімації (створіть AnimationActivity)
                        val intent = Intent(this@MainActivity, AnimationActivity::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        // Перехід на екран RelativeLayout (створіть RelativeActivity)
                        val intent = Intent(this@MainActivity, RelativeActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Дія, якщо нічого не вибрано (зазвичай залишають порожнім)
            }
        }

        buttonPress.setOnClickListener {
            textViewMessage.text = "Maksym Zayats"
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show()
    }

}