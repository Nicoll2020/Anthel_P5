package com.juanrivera.anthel.ui.inicio

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.juanrivera.anthel.R
import com.juanrivera.anthel.databinding.ActivityLoginBinding

class LoginActivity: AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginViewModel = ViewModelProvider(this)[loginViewModel::class.java]

        setContentView(loginBinding.root)
        //loginViewModel.errorMsg.observe(this) { errorMsg ->
            //Toast.makeText(aplicationContext, errorMsg, Toast.LENGTH_SHORT).show()

        //}

        loginBinding.inicioButton.setOnClickListener {
            val correo = loginBinding.emailEditText.text.toString()
            val pass = loginBinding.passwordEditText.text.toString()

            //loginViewModel.validateFields(correo, pass)
        }

    }
}