package com.example.snapchat.domain.usecase

import com.example.snapchat.domain.repository.MessageRepository

class SignInUseCase(
    private val repository: MessageRepository
) {

    operator fun invoke(
        email: String,
        password: String,
    ) {
        repository.signIn(email = email, password = password)
    }

}