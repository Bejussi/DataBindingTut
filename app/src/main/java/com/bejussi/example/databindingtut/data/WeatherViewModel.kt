package com.bejussi.example.databindingtut.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel() {
    // This data is hard-coded but you can imagine it comes from a weather service somewhere
    private val _current_temp = MutableLiveData(30)
    private val _current_conditions = MutableLiveData("Cloudy")
    private val _current_windchill = MutableLiveData(2)

    // TODO: create public properties that we can bind to


    // TODO: implement methods to change the temperature

}