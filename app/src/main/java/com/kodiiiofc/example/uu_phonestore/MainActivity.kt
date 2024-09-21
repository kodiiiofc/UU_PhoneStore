package com.kodiiiofc.example.uu_phonestore

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var choosingCityListView: ListView
    private lateinit var exitBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        choosingCityListView = findViewById(R.id.lv_choosing_city)
        val arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.cities,
            android.R.layout.simple_list_item_1
        )

        choosingCityListView.adapter = arrayAdapter

        choosingCityListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, CatalogActivity::class.java)
            intent.putExtra("city", parent.getItemAtPosition(position).toString())
            startActivity(intent)
        }

        exitBTN = findViewById(R.id.btn_exit)
        exitBTN.setOnClickListener {
            finish()
        }

    }
}