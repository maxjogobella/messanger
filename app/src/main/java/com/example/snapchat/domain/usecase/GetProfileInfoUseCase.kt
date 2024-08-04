package com.example.snapchat.domain.usecase

import com.example.snapchat.domain.model.UserModel
import com.example.snapchat.domain.repository.MessageRepository

class GetProfileInfoUseCase(
    private val repository: MessageRepository
) {

    operator fun invoke(): UserModel {
        return repository.getProfileInfo()
    }
}

