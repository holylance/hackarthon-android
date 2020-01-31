package com.dkb.hackathonandroid.ui.util.network

import com.dkb.hackathonandroid.ui.util.model.User
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    companion object {
        fun create(retrofit: Retrofit): ApiService {
            return ApiFactory.createService(ApiService::class.java)
        }
    }

    @GET("helloworld")
    fun getHelloWorld(): Single<String>

    @GET("user/all")
    fun getUserAll(): Single<List<User>>

    @POST("login")
    fun login(): Single<User>
}
