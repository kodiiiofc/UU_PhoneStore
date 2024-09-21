package com.kodiiiofc.example.uu_phonestore

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var choosingCitySpinner: Spinner
    private lateinit var exitBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        choosingCitySpinner = findViewById(R.id.spinner_choosing_city)
        ArrayAdapter.createFromResource(this, R.array.cities, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            choosingCitySpinner.adapter = adapter
        }

        exitBTN = findViewById(R.id.btn_exit)
        exitBTN.setOnClickListener {
            finish()
        }




    }
}