package com.example.currencycalculator.repository

import com.example.currencycalculator.BuildConfig
import com.example.currencycalculator.api.NetworkApi
import com.example.currencycalculator.model.CurrencyApiResponse
import retrofit2.Response
import javax.inject.Inject


class CurrencyRepository @Inject constructor(private val api: NetworkApi) {

    fun convertCurrency(
        fromCurrencyCode: String,
        toCurrencyCode: String,
        amount: Int
    ): Response<CurrencyApiResponse> {
        return api.convertCurrency(
            accessKey = BuildConfig.API_KEY,
            from = fromCurrencyCode,
            to = toCurrencyCode,
            amount = amount
        )
    }
}