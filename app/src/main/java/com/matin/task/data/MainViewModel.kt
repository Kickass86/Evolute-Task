package com.matin.task.data

import androidx.lifecycle.ViewModel
import com.matin.task.data.network.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val apiService: ApiService
): ViewModel() {
    companion object {
        const val DEFAULT_PAGE = 1
        const val DEFAULT_PAGE_SIZE = 30
    }


    suspend fun getFeeds(){
        apiService.getFeeds(DEFAULT_PAGE, DEFAULT_PAGE_SIZE)
    }
}