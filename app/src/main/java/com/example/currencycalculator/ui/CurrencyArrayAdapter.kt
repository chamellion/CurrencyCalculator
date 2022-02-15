package com.example.currencycalculator.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.currencycalculator.R
import com.example.currencycalculator.model.Currency
import com.example.currencycalculator.utils.mapImageToCurrency

class CurrencyArrayAdapter(context: Context, countryList: List<Currency>) :
    ArrayAdapter<Currency>(context, 0, countryList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView
            ?: return LayoutInflater.from(parent.context).inflate(R.layout.item_currency, parent, false)
        val currentItem = getItem(position)
        val currencyText = view.findViewById<TextView>(R.id.currency_text)
        val actionImage = view.findViewById<ImageView>(R.id.action_image)
        currencyText?.text = currentItem?.currencyCode
        actionImage?.setImageResource(currentItem?.flag ?: -1)
        return view
    }
}