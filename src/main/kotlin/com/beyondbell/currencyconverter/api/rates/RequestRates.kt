package com.beyondbell.currencyconverter.api.rates

import com.beyondbell.currencyconverter.api.API
import com.beyondbell.currencyconverter.api.client
import com.beyondbell.currencyconverter.key
import io.ktor.client.request.get
import io.ktor.client.request.parameter

/**
 * @param date YYYY-MM-DD
 */
internal suspend fun requestRates(date: String = "latest") = client.get<RatesResponse>("$API/$date") {
	parameter("access_key", key)
}.rates ?: error("Failed API Request for $date!")