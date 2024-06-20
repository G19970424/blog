drop table if exists f_blog_user_information;
create table if not exists f_blog_user_information(
    id int not null primary key AUTO_INCREMENT COMMENT '用户信息id',
    user_id int COMMENT '用户id',
    username varchar (32) COMMENT '用户名',
    sex varchar (1) COMMENT '性别',
    phone varchar (11) COMMENT '电话',
    address varchar (255) COMMENT '地址'
)Engine=InnoDB DEFAULT charset=utf8 COMMENT='用户信息表';