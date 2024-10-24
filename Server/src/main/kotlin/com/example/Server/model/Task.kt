package com.example.Server.model

import jakarta.persistence.*
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "tasks")
class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "task_id")
    var taskId: UUID? = null

    @Column(name = "task_name")
    var taskName: String = ""

    @Column(name = "description")
    var description: String = ""

    @Column(name = "create_date")
    var createDate: Date = Date()
}