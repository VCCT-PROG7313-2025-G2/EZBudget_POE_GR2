package com.example.prog7313_poe.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.prog7313_poe.data_access_object.GoalDAO

class HomeViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "This is goals Fragment"
    }
    val text: LiveData<String> = _text

}
