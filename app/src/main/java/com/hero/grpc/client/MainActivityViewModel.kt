package com.hero.grpc.client

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow

//@HiltViewModel
//class MainActivityViewModel @Inject constructor(
//    userDataRepository: UserDataRepository,
//) : ViewModel() {
//    val uiState: StateFlow<MainActivityUiState> = userDataRepository.userData.map {
//        Success(it)
//    }.stateIn(
//        scope = viewModelScope,
//        initialValue = Loading,
//        started = SharingStarted.WhileSubscribed(5_000),
//    )
//}
//
//sealed interface MainActivityUiState {
//    data object Loading : MainActivityUiState
//    data class Success(val userData: UserData) : MainActivityUiState
//}
