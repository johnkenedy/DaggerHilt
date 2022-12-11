package com.example.daggerhilt

import androidx.lifecycle.ViewModel
import com.example.daggerhilt.domain.repository.MyRepository
import dagger.Lazy
import javax.inject.Inject


class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
): ViewModel() {

    init {
        repository.get()
    }
}