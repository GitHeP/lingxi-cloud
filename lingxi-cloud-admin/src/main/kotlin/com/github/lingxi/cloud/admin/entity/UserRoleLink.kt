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
class UserRoleLink : Entity() {

    @Column private var userId: Long
    @Column private var roleId: Long

    override fun toString(): String {
        return "${super.toString()} UserRoleLink(userId=$userId, roleId=$roleId)"
    }

    companion object {
        const val USER_ROLE_LINK_TABLE_NAME = "user_role_link"
    }
}