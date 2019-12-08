package com.example.loginmvpkotlin.presenter

import com.example.loginmvpkotlin.model.User
import com.example.loginmvpkotlin.view.LoginView


class LoginPresenter(private var loginView: LoginView) {
    fun onLogin(email: String, password: String) {
        loginView.showLoading()
        val user = User(email, password)
        val isLoginSuccess = user.isDataValid

        if (isLoginSuccess) {
            loginView.hideLoading()
            loginView.loginResult("Login Success")
        } else {
            loginView.hideLoading()
            loginView.loginError("Login Error")
        }
    }
}