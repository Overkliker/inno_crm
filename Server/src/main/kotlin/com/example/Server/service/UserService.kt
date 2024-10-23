package com.example.Server.service

import com.example.Server.model.User
import com.example.Server.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository
) {

    fun findAllUsers(): List<User>{
        return userRepository.findAll()
    }
}