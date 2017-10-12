package com.example.mikat.coderswang.Services

import com.example.mikat.coderswang.Model.Category
import com.example.mikat.coderswang.Model.Product
import java.util.*

/**
 * Created by mikat on 12.10.2017.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )
    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$28", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
            Product("Devslopes Black Hoodie", "$28", "hoodie04")
    )
    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Ligth Gray", "$28", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$28", "shirt03"),
            Product("Devslopes Hustle", "$28", "shirt04"),
            Product("Kickflip Studios", "$18", "shirt05")
    )

}