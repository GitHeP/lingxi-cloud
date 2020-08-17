
use lingxi_cloud;

create table if not exists `user` (
    id bigint unsigned not null auto_increment primary key comment '自增主键id' ,

    username varchar(30) not null default '' comment '用户名称' ,

    email varchar(50) not null default '' comment '邮件地址' ,

    password varchar(150) not null default '' comment '登录密码' ,

    enabled tinyint unsigned not null default 1 comment '是否启用, 0 - 未启用 , 1 - 启用' ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_email (`email`)
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4_bin comment '系统用户表';

create table if not exists `role` (
    id bigint unsigned not null auto_increment primary key comment '自增主键id' ,

    nickname varchar(50) not null default '' comment '角色昵称' ,

    code varchar(100) not null default '' comment '角色代码' ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_code(`code`)
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4_bin comment '角色表' ;

create table if not exists `authority` (
    id bigint unsigned not null auto_increment primary key comment '自增主键' ,

    parent_id bigint unsigned not null default 0 comment '父节点id , 0 表示没有父节点' ,

    icon varchar(50) not null default '' comment '图标名称' ,

    resource varchar(500) not null comment '资源' ,

    `action` varchar(100) not null comment '' ,

    `order` int unsigned not null default 0 comment '顺序' ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间'
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4_bin comment '权限表' ;

create table if not exists `user_role_link` (
    id bigint unsigned not null auto_increment primary key comment '自增主键' ,

    user_id bigint unsigned not null ,

    role_id bigint unsigned not null ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_userid_roleid(`user_id` , `role_id`)
) engine = InnoDB default charset = utf8mb4 collate = utf8mb4_bin comment '用户角色链接表' ;

create table if not exists `role_authority_link` (
    id bigint unsigned not null auto_increment primary key comment '自增主键' ,

    role_id bigint unsigned not null ,

    authority_id bigint unsigned not null ,

    deleted tinyint unsigned not null default 1 comment '是否删除 , 0 - 删除 , 1 - 未删除' ,

    create_time bigint unsigned not null default 0 comment '记录创建时间' ,

    modify_time bigint unsigned not null default 0 comment '记录修改时间' ,

    unique key uk_roleid_authorityid(`role_id` , `authority_id`)
) engine = InnoDB charset = utf8mb4 collate = utf8mb4_bin comment '角色权限链接表' ;

insert into `user`(username , email ,password  , create_time) values('lingxi' , 'anonymou_s@163.com' , '111' , unix_timestamp(current_timestamp())) ;
insert into role (nickname , code , create_time) values ('超级管理员' , 'Super_Admin' , unix_timestamp(current_timestamp())) ;
insert into user_role_link (user_id , role_id , create_time) values(1 , 1 , unix_timestamp(current_timestamp())) ;