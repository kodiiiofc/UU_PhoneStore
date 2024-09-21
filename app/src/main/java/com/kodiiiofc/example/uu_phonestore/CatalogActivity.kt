package com.kodiiiofc.example.uu_phonestore

import android.app.AlertDialog
import android.os.Bundle
import android.widget.ArrayAdapter
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

        val catalog = CitiesCatalogs().cities.first { it.city == intent.getStringExtra("city") }

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, catalog.products)

        productsLV.adapter = arrayAdapter

        if (catalog.hasRepairService) {
            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setTitle("Ремонт телефонов")
                .setMessage("Вашему телефону требуется ремонт?")
                .setPositiveButton("Да") { dialog, which ->
                    dialog.dismiss()
                    val builder = AlertDialog.Builder(this)
                        .setTitle("Ремонт телефонов")
                        .setMessage("Ваше устройство отремонтировано")
                        .setPositiveButton("ОК") {dialog, which -> dialog.dismiss()}
                        .create()
                    builder.show()
                }
                .setNeutralButton("Нет") {dialog, which -> dialog.dismiss()}
                .create()
            alertBuilder.show()
        }



//        statisticBTN.setOnClickListener {
//            val intent = Intent(this, StatisticActivity::class.java)
//            startActivity(intent)
//        }



    }
}