package com.matin.task.data

import androidx.lifecycle.ViewModel
import com.matin.task.data.network.ApiService
import com.matin.task.model.ApiResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val apiService: ApiService
): ViewModel() {
    companion object {
        const val DEFAULT_PAGE = 1
        const val DEFAULT_PAGE_SIZE = 30
    }


    suspend fun getFeeds(): Flow<ApiResponse> = flow {
        emit(apiService.getFeeds(DEFAULT_PAGE, DEFAULT_PAGE_SIZE))
    }
}