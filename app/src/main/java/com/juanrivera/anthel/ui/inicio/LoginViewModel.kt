package com.juanrivera.anthel.ui.inicio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juanrivera.anthel.data.UserRepository

class LoginViewModel: ViewModel() {
    private val UserRepository = UserRepository()

    private val _errorMsg: MutableLiveData<String> = MutableLiveData()
    val errorMsg : LiveData<String> = _errorMsg
    val email: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val pass: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun compro(correo:String, contra:String): String {
        var resp = ""
        if (correo.isEmpty()){
            resp="Email vacio."
        }else if(contra.isEmpty()){
            resp = "Contraseña vacia."
        }else if(contra.length < 6) {
            resp = "La contraseña debe tener 6 dígitos."
        }else if(correo.isEmpty() && contra.isEmpty()){
            resp="Espacios vacios."
        }else{
            UserRepository.LoginUser(correo, contra)
        }
        return resp
    }

    //fun validateFields(correo: String, pass: String) {
        //if(correo.isEmpty() || pass.isEmpty()){
            //errorMsg.value = "Debe digitar todos los campos"
        //}
    //}


}