package com.tripconnect.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tripconnect.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initialise()
    }

    private fun initialise() {
        btn_login_facebook.setOnClickListener(this)
        btn_login_google.setOnClickListener(this)
        btn_login_email.setOnClickListener(this)
        btn_login.setOnClickListener(this)
        tv_forgot_password.setOnClickListener(this)
        iv_password_visibility.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
        when (v?.id) {
            R.id.btn_login_facebook -> {

            }

            R.id.btn_login_google -> {

            }

            R.id.btn_login_email -> {

            }

            R.id.tv_forgot_password -> {

            }

            R.id.iv_password_visibility -> {
                if (iv_password_visibility.tag.equals(getString(R.string.tag_password_visible))) {
                    iv_password_visibility.tag = getString(R.string.tag_password_not_visible)
                    iv_password_visibility.setImageResource(R.drawable.ic_visibility_off)
                    et_password.inputType = 0
                } else {
                    iv_password_visibility.tag = getString(R.string.tag_password_visible)
                    iv_password_visibility.setImageResource(R.drawable.ic_visibility)
                    et_password.inputType = 1
                }
            }
        }
    }
}
