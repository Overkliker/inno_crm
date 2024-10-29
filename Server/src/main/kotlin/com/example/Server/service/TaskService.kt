package com.example.Server.service

import com.example.Server.repository.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskService(
    val taskRepository: TaskRepository
) {
}