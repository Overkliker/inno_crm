package com.example.Server.controller

import com.example.Server.model.Project
import com.example.Server.service.ProjectService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/projects")
class ProjectController (
    val projectService: ProjectService
) {

    @GetMapping("/all")
    fun getAllProjects(): List<Project>{
        return projectService.getAllProjects()
    }
}