package com.bejussi.example.databindingtut.data

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

data class ObservableWeatherData(
    val current_temp : ObservableInt,
    val current_cond : ObservableField<String>,
    val current_windchill : ObservableInt) {

    // TODO: define some functions to increase or decrease the temperature

}
