drop table if exists f_blog_user;
create table if not exists f_blog_user(
    id int not null primary key AUTO_INCREMENT COMMENT '用户id',
    username varchar (32) COMMENT '登录名',
    password varchar (100) COMMENT '登录密码'
)Engine=InnoDB DEFAULT charset=utf8 COMMENT='用户表';

insert into f_blog_user(username,password) values('admin','{noop}1234');