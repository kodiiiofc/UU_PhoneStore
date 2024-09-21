package com.kodiiiofc.example.uu_phonestore

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CatalogActivity : AppCompatActivity() {

    private lateinit var statisticBTN: Button
    private lateinit var productsLV: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_catalog)

        statisticBTN = findViewById(R.id.btn_statistic)
        productsLV = findViewById(R.id.lv_products)

//        statisticBTN.setOnClickListener {
//            val intent = Intent(this, StatisticActivity::class.java)
//            startActivity(intent)
//        }



    }
}