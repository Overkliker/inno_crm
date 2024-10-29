package com.example.Server.controller

import com.example.Server.service.TaskService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/tasks")
class TaskController(
    val taskService: TaskService,
) {
}