package com.example.Server.service

import com.example.Server.repository.StatusRepository
import org.springframework.stereotype.Service

@Service
class StatusService(
    val statusRepository: StatusRepository
) {
}