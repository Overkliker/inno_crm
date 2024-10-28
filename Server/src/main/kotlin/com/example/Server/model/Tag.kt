package com.example.Server.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "tags")
class Tag (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "tag_id")
    var tagId: UUID? = null,

    @Column(name = "tag_name")
    var tagName: String = "",

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    @JsonIgnore
    var project: Project = Project(),

    @ManyToMany(
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL],
    )
    @JoinTable(
        name = "tags_tasks",
        joinColumns = [JoinColumn(name = "tag_id")],
        inverseJoinColumns = [JoinColumn(name = "task_id")]
    )
    @JsonIgnore
    var tasks: Set<Task> = hashSetOf(),
)
