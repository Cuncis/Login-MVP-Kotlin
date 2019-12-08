package com.example.loginmvpkotlin.view

interface LoginView {
    fun loginResult(message: String)
    fun loginError(errorMessage: String)
    fun showLoading()
    fun hideLoading()
}