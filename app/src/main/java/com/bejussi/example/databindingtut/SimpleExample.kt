package com.bejussi.example.databindingtut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bejussi.example.databindingtut.data.SampleWeatherData
import com.bejussi.example.databindingtut.databinding.ActivitySimpleExampleBinding


class SimpleExample : AppCompatActivity() {
    // TODO: create an instance of the data class
    val theWeather = SampleWeatherData(30,"Overcast",5,"C")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: inflate the layout using the binding library
        val binding: ActivitySimpleExampleBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_simple_example)

        // TODO: connect the data with the layout variable
        binding.weather = theWeather
    }
}