package com.dkb.hackathonandroid.ui.util.network

import com.dkb.hackathonandroid.ui.util.model.TestDTO
import com.dkb.hackathonandroid.ui.util.model.User
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    companion object {
        fun create(): ApiService {
            return ApiFactory.createService(ApiService::class.java)
        }
    }

    @GET("helloworld")
    fun getHelloWorld(): Single<TestDTO>

    @GET("user/all")
    fun getUserAll(): Single<List<User>>

    @POST("login")
    fun login(
        @Header("username")
        userName: String,
        @Header("password")
        password: String
    ): Single<User>
}
