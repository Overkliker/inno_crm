package com.example.Server.model

import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "users")
class User{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    var userId: UUID? = null

    var username: String? = null

    var nickname: String? = null

    var password: String? = null

    var email: String? = null

    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = [
            CascadeType.PERSIST,
            CascadeType.MERGE
        ]
    )
    @JoinTable(
        name = "users_projects",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "project_id")]

    )
    var projects: Set<Project> = hashSetOf()
}

