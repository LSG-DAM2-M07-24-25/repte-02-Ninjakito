package com.ninjakito.dragonballdaima.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {
    private val _name = MutableLiveData<String>()
    val name : LiveData<String> = _name

    fun onChangeName(new_name: String) {
        _name.value = new_name.trim()
    }
}