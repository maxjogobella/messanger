package com.example.snapchat.domain.usecase

import com.example.snapchat.domain.model.FriendModel
import com.example.snapchat.domain.repository.MessageRepository

class GetListOfFriendsUseCase(
    private val repository: MessageRepository
) {

    operator fun invoke(): List<FriendModel> {
        return repository.getListOfFriends()
    }

}