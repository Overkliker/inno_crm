package com.example.Server.repository

import com.example.Server.model.Tasks
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface TaskRepository: JpaRepository<Tasks, UUID> {
}