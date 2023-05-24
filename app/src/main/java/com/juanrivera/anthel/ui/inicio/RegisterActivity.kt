package com.juanrivera.anthel.ui.inicio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.juanrivera.anthel.R
import com.juanrivera.anthel.databinding.ActivityRegisterBinding

class RegisterActivity:AppCompatActivity() {
    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(registerBinding.root)
    }
}