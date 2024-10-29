package com.example.Server.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.scheduling.config.Task
import java.util.*

interface TaskRepository: JpaRepository<Task, UUID> {
}