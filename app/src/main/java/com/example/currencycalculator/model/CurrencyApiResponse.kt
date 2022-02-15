package com.example.currencycalculator.model

import com.squareup.moshi.Json

data class CurrencyApiResponse(

	@Json(name="date")
	val date: String? = null,

	@Json(name="result")
	val result: Double? = null,

	@Json(name="success")
	val success: Boolean? = null,

	@Json(name="query")
	val query: Query? = null,

	@Json(name="historical")
	val historical: Boolean? = null,

	@Json(name="info")
	val info: Info? = null
)

data class Query(

	@Json(name="amount")
	val amount: Int? = null,

	@Json(name="from")
	val from: String? = null,

	@Json(name="to")
	val to: String? = null
)

data class Info(

	@Json(name="rate")
	val rate: Double? = null,

	@Json(name="timestamp")
	val timestamp: Int? = null
)
