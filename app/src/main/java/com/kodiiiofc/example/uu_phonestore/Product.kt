package com.kodiiiofc.example.uu_phonestore

data class Product(val name: String, var price: Int, var selled: Int = 0)

val baseCatalog: MutableList<Product> = mutableListOf(
    Product("iPhone 16 128GB", 114_990),
    Product("iPhone 16 Pro 256GB", 169_990),
    Product("iPhone 16 Pro 512GB", 199_990),
    Product("Samsung Galaxy Z Fold 6 12/256GB", 189_990),
    Product("Xiaomi 14 Ultra 16/512GB", 134_990),
    Product("Xiaomi 14 12/512GB", 94_990)
)