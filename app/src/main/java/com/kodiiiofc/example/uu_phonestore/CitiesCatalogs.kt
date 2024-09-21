package com.kodiiiofc.example.uu_phonestore

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

class CitiesCatalogs() : Serializable {

    val cities = listOf(
        Catalog("Оренбург", baseCatalog, 1.2),
        Catalog ("Москва", baseCatalog,1.1,true)

    )

}