package com.dkb.hackathonandroid.ui.login

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.dkb.hackathonandroid.R
import com.dkb.hackathonandroid.ui.share.BaseActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    private val viewModel = LoginViewModel(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            viewModel.helloWorld()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show() },
                    { Log.d("Error", it.toString()) }
                )
        }
    }
}
