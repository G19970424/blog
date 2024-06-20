drop table if exists f_blog_role_user;
create table if not exists f_blog_role_user(
    rid int not null,
    uid int not null,
    unique `uk_rid_uid`(rid, uid)
) Engine=InnoDB DEFAULT charset=utf8 COMMENT = '用户角色中间表';