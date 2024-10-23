package com.example.Server.repository

import com.example.Server.model.Project
import com.example.Server.model.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ProjectRepository : JpaRepository<Project, UUID>{
}