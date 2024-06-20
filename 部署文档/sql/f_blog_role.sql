drop table if exists f_blog_role;
create table if not exists f_blog_role(
    id int(10)  not null  primary key  AUTO_INCREMENT  COMMENT '角色编号' ,
    name varchar(100)  COMMENT '角色名称'
) Engine=InnoDB DEFAULT charset=utf8 COMMENT = '角色表';

insert into f_blog_role(name) values("ROLE_ADMIN");
insert into f_blog_role(name) values("ROLE_USER");