package com.bejussi.example.databindingtut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bejussi.example.databindingtut.databinding.ActivityObservableFieldsBinding

class ObservableFields : AppCompatActivity() {
    // TODO: create an ObservableWeatherData model


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityObservableFieldsBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_observable_fields)

        // TODO: bind to the observable model

    }
}