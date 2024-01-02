package com.sobhan.interview2.data.repo

import com.sobhan.interview2.data.api.Api
import com.sobhan.interview2.data.model.ResponseModel
import javax.inject.Inject

class Repo @Inject constructor(private val api: Api) {

    suspend fun getData(): ResponseModel{
        val result = api.getData()
        return result
    }
}