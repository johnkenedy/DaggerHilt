package com.example.daggerhilt.data.repository

import com.example.daggerhilt.data.remote.MyApi
import com.example.daggerhilt.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi
) : MyRepository {

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}