package com.josphat.meowmeowapi.ui

import androidx.lifecycle.ViewModel
import com.josphat.meowmeowapi.data.repository.CatRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val catRepo: CatRepo
) : ViewModel() {

}