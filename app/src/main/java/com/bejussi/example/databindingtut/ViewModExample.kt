package com.bejussi.example.databindingtut

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bejussi.example.databindingtut.data.WeatherViewModel
import com.bejussi.example.databindingtut.databinding.ActivityViewModExampleBinding


class ViewModExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: WeatherViewModel by viewModels()
        val binding : ActivityViewModExampleBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_view_mod_example)

        binding.weather = viewModel
        // TODO: set the lifecycle owner to the Activity
        binding.lifecycleOwner = this
    }
}
