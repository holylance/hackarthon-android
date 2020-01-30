package com.dkb.hackathonandroid.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dkb.hackathonandroid.R

class LoginActivity : AppCompatActivity() {

    private val viewModel = LoginViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
