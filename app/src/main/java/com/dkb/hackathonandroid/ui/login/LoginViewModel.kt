package com.dkb.hackathonandroid.ui.login

import android.content.Context
import android.content.Intent
import com.dkb.hackathonandroid.ui.main.MainActivity
import com.dkb.hackathonandroid.ui.share.BaseViewModel
import com.dkb.hackathonandroid.ui.util.model.User
import com.dkb.hackathonandroid.ui.util.network.ApiService
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class LoginViewModel(
    private val context: Context
) : BaseViewModel() {

    private val service = ApiService.create()

    fun login(userName: String, password: String): Single<User> {
        return service.login()
            .subscribeOn(Schedulers.io())
    }

    fun helloWorld(): Single<String> {
        return service.getHelloWorld()
            .subscribeOn(Schedulers.io())
    }

    fun onDirectToMainActivity() {
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }
}
