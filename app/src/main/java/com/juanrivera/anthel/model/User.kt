package com.juanrivera.anthel.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.google.firebase.firestore.auth.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class UserDataBase : RoomDatabase() {
    //abstract fun UserDAO() : UserDAO
}