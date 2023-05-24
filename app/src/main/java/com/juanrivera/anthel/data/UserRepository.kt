package com.juanrivera.anthel.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class UserRepository {
    private var auth: FirebaseAuth = Firebase.auth

    fun LoginUser(correo: String, contra: String) {
        auth.createUserWithEmailAndPassword(correo, contra)

    }
}