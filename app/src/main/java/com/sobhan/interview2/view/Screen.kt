package com.sobhan.interview2.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.sobhan.interview2.viewmodel.MainViewModel

@Composable
fun MainScreen(){
    val viewModel : MainViewModel = hiltViewModel()
    val state = viewModel.state.collectAsState()

    Text(text = state.value?.fact ?: "empty")
}