package com.kodiiiofc.example.uu_phonestore

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StatisticActivity : AppCompatActivity() {

    private lateinit var backBTN: Button
    private lateinit var statisticTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_statistic)

        backBTN = findViewById(R.id.btn_back)
        statisticTV = findViewById(R.id.tv_statistic)

        backBTN.setOnClickListener {
            finish()
        }

        val spentMoney = intent.getIntExtra("spentMoney", 0)
        val catalog = intent.getSerializableExtra("catalog") as Catalog
        val table = catalog.products.joinToString(separator = "") {
            if (it.selled != 0) {
                it.name + " - " + it.selled + " шт." + "\n\n"
            } else ""
        }
        statisticTV.text = "Всего продано товаров на сумму: $spentMoney рублей." + "\n\n" + table


    }
}