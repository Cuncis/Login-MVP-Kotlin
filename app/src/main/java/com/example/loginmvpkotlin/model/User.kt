package com.example.loginmvpkotlin.model

import android.text.TextUtils
import android.util.Patterns

data class User(val email: String, val password: String) {
    val isDataValid: Boolean
        get() = (!TextUtils.isEmpty(email) &&
                    Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
                    password.length > 6)
}