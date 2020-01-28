package com.tripconnect.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.tripconnect.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        btnSignUp.setOnClickListener(this)
        tvLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnSignUp -> {
                launchSignUpActivity()
            }

            R.id.tvLogin -> {
                launchLoginActivity()
            }

        }
    }

    fun launchSignUpActivity() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    fun launchLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
