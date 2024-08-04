package com.example.snapchat.domain.repository

import android.os.Message
import com.example.snapchat.domain.model.FriendModel
import com.example.snapchat.domain.model.MessageModel
import com.example.snapchat.domain.model.UserModel

interface MessageRepository {

    fun sendMessage(message : String) : Message
    fun getListOfMessage() : List<MessageModel>
    fun signUp(
        email : String,
        password : String,
        name : String,
        age : Int,
        gender : String,
    )
    fun signIn(
        email : String,
        password : String
    )
    fun getListOfFriends() : List<FriendModel>
    fun getProfileInfo() : UserModel
    fun resetPassword(email : String)


}