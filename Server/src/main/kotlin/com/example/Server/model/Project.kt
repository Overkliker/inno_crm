package com.example.Server.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "projects")
class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "project_id")
    var projectId: UUID? = null

    var name: String? = null

    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = [
            CascadeType.PERSIST,
            CascadeType.MERGE
        ],
        mappedBy = "projects"
    )
    @JsonIgnore
    var users: Set<User> = hashSetOf()
}