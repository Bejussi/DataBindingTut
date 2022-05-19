package com.bejussi.example.databindingtut.BindingAdapters

import android.opengl.Visibility
import android.view.View
import androidx.databinding.BindingAdapter

// TODO: create a Binding Adapter that hides the wind chill setting if it's zero
@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, value: Int) {
    view.visibility = if (value==0 ) View.GONE else View.VISIBLE
}

// TODO: Programming Challenge: set the color of the temp text based on value

