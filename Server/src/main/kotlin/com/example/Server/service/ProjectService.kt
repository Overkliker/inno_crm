package com.example.Server.service

import com.example.Server.model.Project
import com.example.Server.repository.ProjectRepository
import org.springframework.stereotype.Service

@Service
class ProjectService (
    val userRepository: ProjectRepository
) {

    fun getAllProjects(): List<Project>{
        return userRepository.findAll()
    }
}