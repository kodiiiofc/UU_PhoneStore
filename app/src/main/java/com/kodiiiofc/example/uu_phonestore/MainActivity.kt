package com.kodiiiofc.example.uu_phonestore

import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.get

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

        choosingCitySpinner.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->
            val intent = Intent(this, CatalogActivity::class.java)
            val city = parent.getItemAtPosition(position).toString()
            intent.putExtra("City", city)
            startActivity(intent)
        }

        exitBTN = findViewById(R.id.btn_exit)
        exitBTN.setOnClickListener {
            finish()
        }

    }
}