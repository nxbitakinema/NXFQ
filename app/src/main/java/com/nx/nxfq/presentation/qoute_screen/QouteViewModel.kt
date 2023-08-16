package com.nx.nxfq.presentation.qoute_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nx.nxfq.domain.model.Response.Loading
import com.nx.nxfq.domain.model.Response.Success
import com.nx.nxfq.domain.repository.AddQouteResponse
import com.nx.nxfq.domain.repository.AppResponse
import com.nx.nxfq.domain.repository.DeleteQouteResponse
import com.nx.nxfq.domain.use_case.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QouteViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {

    var appResponse by mutableStateOf<AppResponse>(Loading)
        private set

    var addQouteResponse by mutableStateOf<AddQouteResponse>(Success(false))
        private set

    var deleteQouteResponse by mutableStateOf<DeleteQouteResponse>(Success(false))
        private set

    init {
        getQoute()
    }

    private fun getQoute() = viewModelScope.launch {
        useCase.getQoute().collect { response ->
            appResponse = response
        }
    }

    fun addQoute(title: String, author: String) = viewModelScope.launch {
        addQouteResponse = Loading
        addQouteResponse = useCase.addQoute(title, author)
    }

    fun deleteQoute(qouteId: String) = viewModelScope.launch {
        deleteQouteResponse = Loading
        deleteQouteResponse = useCase.deleteQoute(qouteId)
    }

}