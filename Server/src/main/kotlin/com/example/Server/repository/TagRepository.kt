package com.example.Server.repository

import com.example.Server.model.Tag
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface TagRepository: JpaRepository<Tag, UUID> {
}