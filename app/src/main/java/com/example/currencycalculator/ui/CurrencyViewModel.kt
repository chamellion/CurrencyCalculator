package com.example.currencycalculator.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CurrencyViewModel @Inject constructor(): ViewModel() {

    val fromCurrency = MutableLiveData<String>()
    val toCurrency = MutableLiveData<String>()

    val fromCurrencyFlag = MutableLiveData<String>()
    val toCurrencyFlag = MutableLiveData<String>()



    fun convertCurrency(){

    }
}