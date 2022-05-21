package com.ezatpanah.viewmodel_youtube

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var counter = 0

    fun addNumber() {
        counter++
    }
}