package com.example.snapchat.domain.usecase

import com.example.snapchat.domain.repository.MessageRepository

class SendMessageUseCase(
    private val repository: MessageRepository
) {

    operator fun invoke(
        message: String
    ) {
        repository.sendMessage(message = message)
    }
}