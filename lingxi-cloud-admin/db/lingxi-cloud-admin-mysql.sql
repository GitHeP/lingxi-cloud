

create table `user` (
    id bigint unsigned not null auto_increment primary key comment '自增主键id' ,

    username varchar(30) default '' not null comment '用户名称' ,

    email varchar(50) default '' not null comment '邮件地址' ,

    enabled tinyint unsigned not null default 0 comment '是否启用, 0 - 未启用 , 1 - 启用' ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_email (`email`)
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4_bin comment '系统用户表';

create table `role` (
    id bigint unsigned not null auto_increment primary key comment '自增主键id' ,

    nickname varchar(50) not null default '' comment '角色昵称' ,

    code varchar(100) not null default '' comment '角色代码' ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_code(`code`)
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4_bin comment '角色表' ;

create table `authority` (
    id bigint unsigned not null auto_increment primary key comment '自增主键' ,

    resource varchar(500) not null default '' comment '资源' ,

    action varchar(100) not null default '' comment '' ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间'
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4_bin comment '权限表' ;

create table `user_role_link` (
    id bigint unsigned not null auto_increment primary key comment '自增主键' ,

    user_id bigint unsigned not null ,

    role_id bigint unsigned not null ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_userid_roleid(`user_id` , `role_id`)
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4 comment '用户角色链接表'

create table `role_authority_link` (
    id bigint unsigned not null auto_increment primary key comment '自增主键' ,

    role_id bigint unsigned not null ,

    authority_id bigint unsigned not null ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_roleid_authorityid(`role_id` , `authority_id`)
) engine = InnoDB charset = utf8mb4 collate = utf8mb4_bin comment '角色权限链接表'