package com.example.greedyimage.model

import com.example.kotlindemo.model.Data_
import com.example.kotlindemo.model.Posters
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET("/r/images/hot.json")
    fun getThumpnail() :Single<Posters>
}