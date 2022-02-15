package com.example.currencycalculator.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.viewModels
import com.example.currencycalculator.R
import com.example.currencycalculator.databinding.FragmentCurrencyHomeBinding
import com.example.currencycalculator.model.Currency
import com.example.currencycalculator.utils.mapImageToCurrency
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrencyHomeFragment : Fragment() {

    private lateinit var binding: FragmentCurrencyHomeBinding

    private val currencyViewModel by viewModels<CurrencyViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCurrencyHomeBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = viewLifecycleOwner
        binding.currencyViewModel = currencyViewModel

        val currencyList = createCurrencyList()
        val currencyArrayAdapter = CurrencyArrayAdapter(requireContext(), currencyList)

        binding.fromDropDown.setAdapter(currencyArrayAdapter)
        binding.toDropDown.setAdapter(currencyArrayAdapter)

        val window = requireActivity().window
        setStatusBarTextColor(window)

        return binding.root
    }

    private fun setStatusBarTextColor(window: Window) {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        window.statusBarColor =
            ContextCompat.getColor(requireContext(), R.color.white)
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = true
    }
    private fun createCurrencyList(): List<Currency>{
        val data = resources.getStringArray(R.array.country_list)
        val currencyList = arrayListOf<Currency>()
        for (datum in data){
            val drawable = mapImageToCurrency(datum)
            currencyList.add(Currency(drawable, datum))
        }
        return currencyList
    }
}