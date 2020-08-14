package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum
import com.github.lingxi.cloud.admin.entity.RoleAuthorityLink.Companion.ROLE_AUTHORITY_LINK_TABLE_NAME
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = ROLE_AUTHORITY_LINK_TABLE_NAME)
class RoleAuthorityLink(id: Long , createTime: Long , modifyTime: Long, deleted: DeletedEnum
                        , private var roleId: Long , private var authorityId: Long) : Entity(id , createTime , modifyTime , deleted) {

    companion object {
        const val ROLE_AUTHORITY_LINK_TABLE_NAME = "role_authority_link"
    }

    constructor()

    override fun toString(): String {
        return "${super.toString()} RoleAuthorityLink(roleId=$roleId, authorityId=$authorityId)"
    }
}