insert into users (user_id, username, nickname, password, email)
values ('13819694-86e1-4816-8a0e-003cf0dec447', 'admin', 'admin', 'admin', 'admin@mail.com');

insert into projects (project_id, name)
values ('80ecb30c-e98e-4934-9806-02b5219df723', 'admin-project');

insert into projects (project_id, name)
values ('2fad8f8d-fdb3-4443-8727-0ec36b21a4c6', 'none-admin-project');

insert into users_projects (user_id, project_id)
values ('13819694-86e1-4816-8a0e-003cf0dec447', '80ecb30c-e98e-4934-9806-02b5219df723');