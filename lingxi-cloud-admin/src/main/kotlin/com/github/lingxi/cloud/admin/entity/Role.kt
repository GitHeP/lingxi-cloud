package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.entity.Role.Companion.ROLE_TABLE_NAME
import javax.persistence.Column
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = ROLE_TABLE_NAME)
class Role : Entity() {

    @Column private lateinit var nickname: String
    @Column private lateinit var code: String

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = RoleAuthorityLink.ROLE_AUTHORITY_LINK_TABLE_NAME,
        joinColumns = [JoinColumn(name = "roleId")] ,
        inverseJoinColumns = [JoinColumn(name = "authorityId")])
    private lateinit var authoritys: List<Authority>

    override fun toString(): String {
        return "${super.toString()} Role(nickname='$nickname', code='$code' , authoritys='$authoritys')"
    }

    companion object {
        const val ROLE_TABLE_NAME = "role"
    }
}