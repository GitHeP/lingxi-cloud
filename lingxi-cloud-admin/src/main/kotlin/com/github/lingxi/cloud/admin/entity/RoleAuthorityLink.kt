package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum

/**
 *
 * @author he peng
 * @date 2020/8/13
 */
class RoleAuthorityLink(id: Long , createTime: Long , modifyTime: Long, deleted: DeletedEnum
                        , private var roleId: Long , private var authorityId: Long) : Entity(id , createTime , modifyTime , deleted) {

    override fun toString(): String {
        return "${super.toString()} RoleAuthorityLink(roleId=$roleId, authorityId=$authorityId)"
    }
}