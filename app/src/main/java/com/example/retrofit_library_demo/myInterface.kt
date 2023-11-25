package com.example.retrofit_library_demo

import retrofit2.http.GET

interface myInterface   {

    @GET("/quotes")
    suspend fun getQuotes() : retrofit2.Response<QuoteList>
}