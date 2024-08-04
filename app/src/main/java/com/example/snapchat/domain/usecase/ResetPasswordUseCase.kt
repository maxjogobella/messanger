package com.example.snapchat.domain.usecase

import com.example.snapchat.domain.repository.MessageRepository

class ResetPasswordUseCase(
    private val repository: MessageRepository
) {

    operator fun invoke(email: String) {
        repository.resetPassword(email = email)
    }

}