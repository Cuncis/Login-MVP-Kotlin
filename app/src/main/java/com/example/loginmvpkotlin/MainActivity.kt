package com.example.loginmvpkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginmvpkotlin.presenter.LoginPresenter
import com.example.loginmvpkotlin.view.LoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginView {

    private var loginPresenter: LoginPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        btn_login.setOnClickListener {
            loginPresenter?.onLogin(et_email.text.toString(), et_password.text.toString())
        }
    }

    override fun loginResult(message: String) {
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
    }

    override fun loginError(errorMessage: String) {
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        progressBar.visibility = View.GONE
    }
}
