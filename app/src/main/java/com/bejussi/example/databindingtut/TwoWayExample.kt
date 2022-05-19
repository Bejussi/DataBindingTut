package com.bejussi.example.databindingtut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.bejussi.example.databindingtut.data.WeatherViewModel
import com.bejussi.example.databindingtut.databinding.ActivityTwoWayExampleBinding

class TwoWayExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: WeatherViewModel by viewModels()
        val binding: ActivityTwoWayExampleBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_two_way_example)

        binding.weather = viewModel
        binding.lifecycleOwner = this
    }
}