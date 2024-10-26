package com.example.Server.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.UUID

@Entity
@Table(name = "tasks")
class Task (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "task_id")
    var taskId: UUID? = null,

    @Column(name = "task_name")
    var taskName: String = "",

    @Column(name = "description")
    var description: String? = null,

    @Column(name = "create_date")
    val createDate: LocalDateTime = LocalDateTime.now(ZoneOffset.UTC),

    @Column(name = "last_update")
    var lastUpdate: LocalDateTime = LocalDateTime.now(ZoneOffset.UTC),

    var deadline: LocalDateTime = LocalDateTime.now(ZoneOffset.UTC),

    var position: Int = -1,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    @JsonIgnore
    var project: Project = Project(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", nullable = false)
    @JsonIgnore
    var status: Status = Status(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    var user: User? = null
)