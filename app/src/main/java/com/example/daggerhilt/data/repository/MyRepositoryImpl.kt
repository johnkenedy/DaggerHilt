package com.example.daggerhilt.data.repository

import android.app.Application
import com.example.daggerhilt.R
import com.example.daggerhilt.data.remote.MyApi
import com.example.daggerhilt.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
    }

    override suspend fun doNetworkCall() {
    }
}