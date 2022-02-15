package com.example.currencycalculator.api

import com.example.currencycalculator.model.CurrencyApiResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface NetworkApi {


    @POST("convert")
    fun convertCurrency(@Query("access_key") accessKey: String,
                        @Query("from") from: String,
                        @Query("to") to: String,
                        @Query("amount") amount: Int): Response<CurrencyApiResponse>
}