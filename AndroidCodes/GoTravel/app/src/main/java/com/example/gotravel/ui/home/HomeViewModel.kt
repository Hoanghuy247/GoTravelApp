package com.example.gotravel.ui.home

import android.app.Application
import com.example.gotravel.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(application: Application) : BaseViewModel(application){

}