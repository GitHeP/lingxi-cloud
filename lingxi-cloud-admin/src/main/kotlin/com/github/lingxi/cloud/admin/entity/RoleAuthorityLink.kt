package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.entity.RoleAuthorityLink.Companion.ROLE_AUTHORITY_LINK_TABLE_NAME
import javax.persistence.Column
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = ROLE_AUTHORITY_LINK_TABLE_NAME)
class RoleAuthorityLink : Entity() {


    @Column private var roleId: Long? = null
    @Column private var authorityId: Long? = null

    override fun toString(): String {
        return "${super.toString()} RoleAuthorityLink(roleId=$roleId, authorityId=$authorityId)"
    }

    companion object {
        const val ROLE_AUTHORITY_LINK_TABLE_NAME = "role_authority_link"
    }

}