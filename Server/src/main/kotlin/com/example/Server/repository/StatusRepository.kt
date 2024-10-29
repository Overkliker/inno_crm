package com.example.Server.repository

import com.example.Server.model.Status
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface StatusRepository: JpaRepository<Status, UUID> {
}