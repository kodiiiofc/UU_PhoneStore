package com.kodiiiofc.example.uu_phonestore

import java.io.Serializable

class Catalog (
    val city: String,
    val baseProductList: List<Product>,
    var multiplyingFactor: Double = 1.0,
    var hasRepairService: Boolean = false
) : Serializable {

    var products: List<Product> = listOf()

    init {
        updateCatalog()
    }

    fun updateCatalog() {
        val mutableList: MutableList<Product> = mutableListOf()
        baseProductList.forEach {
            val product = it.copy()
            product.price = (it.price * multiplyingFactor).toInt()
            mutableList += product
        }
        products = mutableList
    }

    override fun toString(): String {
        return "City: $city." +
                "\nProducts: $products"
    }

}