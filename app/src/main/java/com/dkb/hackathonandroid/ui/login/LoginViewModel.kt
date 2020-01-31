package com.dkb.hackathonandroid.ui.login

import android.content.Context
import android.content.Intent
import com.dkb.hackathonandroid.ui.main.MainActivity
import com.dkb.hackathonandroid.ui.share.BaseViewModel

class LoginViewModel(
    private val context: Context
) : BaseViewModel() {

    fun login(userName: String, password: String): Boolean {
        return true
    }

    fun onDirectToMainActivity() {
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }
}
