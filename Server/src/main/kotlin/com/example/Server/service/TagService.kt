package com.example.Server.service

import com.example.Server.repository.TagRepository
import org.springframework.stereotype.Service

@Service
class TagService(
    val tagRepository: TagRepository
) {
}