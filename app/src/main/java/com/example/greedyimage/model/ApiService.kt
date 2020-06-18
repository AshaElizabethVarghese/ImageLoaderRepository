package com.example.greedyimage.model

import com.example.kotlindemo.model.Data_
import com.example.kotlindemo.model.Posters
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class ApiService {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://www.reddit.com")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ApiInterface::class.java)

    fun getThumpnail() :Single<Posters>{
        return retrofit.getThumpnail()
    }

}