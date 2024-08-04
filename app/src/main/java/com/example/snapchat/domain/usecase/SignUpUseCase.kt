package com.example.snapchat.domain.usecase

import com.example.snapchat.domain.repository.MessageRepository

class SignUpUseCase(
    private val repository: MessageRepository
) {

    operator fun invoke(
        email : String,
        password : String,
        name : String,
        age : Int,
        gender : String
    ) {
        repository.signUp(
            email = email,
            password = password,
            name = name,
            age = age,
            gender = gender
        )
    }
}