package com.example.pertemuan10.ui.viemodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan10.KrsApp
import com.example.pertemuan10.ui.viewmodel.MahasiswaViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            MahasiswaViewModel(
                KrsApp().containerApp.repositoryMhs
            )
        }
        initializer {
            HomeMhsViewModel(
                KrsApp().containerApp.repositoryMhs
            )
        }
        initializer{
            DetailMhsViewModel(
                createSavedStateHandle(),
                KrsApp().containerApp.repositoryMhs
            )
        }
        initializer{
            UpdateMhsViewModel(
                createSavedStateHandle(),
                KrsApp().containerApp.repositoryMhs
            )
        }
    }
}

fun CreationExtras.KrsApp(): KrsApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KrsApp)