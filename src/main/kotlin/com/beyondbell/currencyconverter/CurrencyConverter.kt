package com.beyondbell.currencyconverter

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.TextField
import javafx.stage.Stage
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() = Application.launch(CurrencyConverter::class.java)

internal class CurrencyConverter : Application() {
	override fun start(primaryStage: Stage) {
		primaryStage.scene = Scene(FXMLLoader(javaClass.getResource("/currency_converter.fxml")).load())
		primaryStage.show()
	}

	lateinit var textfield1: TextField

	init {
		GlobalScope.launch {
			delay(500)
			println(this@CurrencyConverter::textfield1.isInitialized)
		}
	}
}