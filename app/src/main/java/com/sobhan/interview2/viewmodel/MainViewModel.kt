package com.sobhan.interview2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sobhan.interview2.data.model.ResponseModel
import com.sobhan.interview2.data.repo.Repo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: Repo): ViewModel() {

    private val _state: MutableStateFlow<ResponseModel?> = MutableStateFlow(null)
    val state : StateFlow<ResponseModel?> = _state

    init {
        getData()
    }
    fun getData(){
        viewModelScope.launch(Dispatchers.IO) {
            val result = repo.getData()
            _state.emit(result)
        }
    }
}