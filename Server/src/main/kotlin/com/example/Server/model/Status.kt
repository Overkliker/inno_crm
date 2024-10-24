package com.example.Server.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "statuses")
class Status {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "status_id")
    var statusId: UUID? = null

    var statusName: String = ""

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    @JsonIgnore
    var project: Project = Project()
}