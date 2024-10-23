create table users(
    user_id UUID primary key,
    username varchar not null,
    nickname varchar not null,
    password varchar not null,
    email varchar not null
);

create table projects(
    project_id UUID primary key ,
    name varchar not null
);

create table users_projects(
    user_id UUID not null ,
    project_id UUID not null,

    FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE,
    FOREIGN KEY (project_id) REFERENCES projects (project_id) ON DELETE CASCADE
);