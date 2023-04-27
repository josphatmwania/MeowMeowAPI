package com.josphat.meowmeowapi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.josphat.meowmeowapi.data.api.model.Cat
import com.josphat.meowmeowapi.data.repository.CatRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CatViewModel @Inject constructor(
    private val catRepo: CatRepo
) : ViewModel() {

    private val _state = MutableStateFlow(emptyList<Cat>())
    val state: StateFlow<List<Cat>>
        get() = _state


    init {
        viewModelScope.launch {
            val cat = catRepo.getCat()
            _state.value = cat
        }
    }

}