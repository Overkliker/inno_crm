package com.example.Server.controller

import com.example.Server.model.User
import com.example.Server.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/users")
class UserController(
    val userService: UserService
) {

    @GetMapping("/all")
    fun findAllUsers(): List<User>{
        return userService.findAllUsers()
    }
}