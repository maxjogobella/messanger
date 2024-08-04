package com.example.snapchat.domain.usecase

import com.example.snapchat.domain.model.MessageModel
import com.example.snapchat.domain.repository.MessageRepository

class GetListOfMessagesUseCase(
    private val repository: MessageRepository
) {
    operator fun invoke() : List<MessageModel> {
        return repository.getListOfMessage()
    }
}