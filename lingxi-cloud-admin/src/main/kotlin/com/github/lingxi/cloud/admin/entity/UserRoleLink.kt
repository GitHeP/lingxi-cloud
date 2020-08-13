package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum

/**
 *
 * @author he peng
 * @date 2020/8/13
 */
class UserRoleLink(id: Long , createTime: Long , modifyTime: Long, deleted: DeletedEnum
                   , private var userId: Long ,private var roleId: Long) : Entity(id , createTime , modifyTime , deleted) {

    override fun toString(): String {
        return "${super.toString()} UserRoleLink(userId=$userId, roleId=$roleId)"
    }
}