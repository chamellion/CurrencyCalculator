package com.example.currencycalculator.utils

import com.example.currencycalculator.R


const val BASE_URL = "http://data.fixer.io/api/"


fun mapImageToCurrency(currencyCode: String?): Int{
    when(currencyCode){
        "EUR" -> {
            return R.drawable.img
        }
        "PLN" -> {
            return R.drawable.img_1
        }
        "USD" -> {
            return R.drawable.img_2
        }
        "CAD" -> {
            return R.drawable.img_3
        }
        "NGN" -> {
            return R.drawable.img_4
        }
        else -> return R.drawable.img
    }
}