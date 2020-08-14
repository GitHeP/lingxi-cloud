package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum
import com.github.lingxi.cloud.admin.entity.UserRoleLink.Companion.USER_ROLE_LINK_TABLE_NAME
import javax.persistence.Column
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = USER_ROLE_LINK_TABLE_NAME)
class UserRoleLink(id: Long, createTime: Long, modifyTime: Long, deleted: DeletedEnum
                   , @Column private var userId: Long, @Column private var roleId: Long) : Entity(id , createTime , modifyTime , deleted) {


    companion object {
        const val USER_ROLE_LINK_TABLE_NAME = "user_role_link"
    }

    constructor()

    override fun toString(): String {
        return "${super.toString()} UserRoleLink(userId=$userId, roleId=$roleId)"
    }
}