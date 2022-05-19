package com.bejussi.example.databindingtut.BindingAdapters

import android.graphics.Color
import android.opengl.Visibility
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import kotlinx.android.synthetic.main.activity_main.view.*

// TODO: create a Binding Adapter that hides the wind chill setting if it's zero
@BindingAdapter("app:hideIfZero")
fun hideIfZero(view: View, value: Int) {
    view.visibility = if (value==0 ) View.GONE else View.VISIBLE
}

// TODO: Programming Challenge: set the color of the temp text based on value
@BindingAdapter("app:changeColor")
fun changeColor(view: TextView, value: Int) {
    when {
        value < 15 -> view.setTextColor(Color.BLUE)
        value in 15..21 -> view.setTextColor(Color.YELLOW)
        value > 21 -> view.setTextColor(Color.RED)
    }
}
