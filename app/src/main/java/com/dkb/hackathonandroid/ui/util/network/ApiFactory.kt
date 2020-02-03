package com.dkb.hackathonandroid.ui.util.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiFactory {
    companion object {
        private const val URL = "http://10.0.2.2:8080/"
        private val httpClient = OkHttpClient.Builder()
        private val builder = Retrofit.Builder()
            .baseUrl(URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())

        private val retrofit = builder.build()
        fun <S> createService(serviceClass: Class<S>): S {
            return builder.build().create(serviceClass)
        }
    }

}
