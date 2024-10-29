package com.example.Server.controller

import com.example.Server.service.StatusService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/statuses")
class StatusController(
    val statusService: StatusService
) {
}