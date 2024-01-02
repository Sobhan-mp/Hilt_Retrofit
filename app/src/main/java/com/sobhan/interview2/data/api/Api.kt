package com.sobhan.interview2.data.api

import com.sobhan.interview2.data.model.ResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("fact")
    suspend fun getData(): ResponseModel

}