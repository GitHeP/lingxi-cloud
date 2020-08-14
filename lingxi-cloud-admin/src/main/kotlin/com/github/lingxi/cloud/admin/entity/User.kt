package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.EnabledEnum
import com.github.lingxi.cloud.admin.entity.User.Companion.USER_TABLE_NAME
import com.github.lingxi.cloud.admin.entity.UserRoleLink.Companion.USER_ROLE_LINK_TABLE_NAME
import javax.persistence.Column
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
@Table(name = USER_TABLE_NAME)
class User : Entity() {

    @Column private lateinit var username: String
    @Column private lateinit var email: String
    @Column private lateinit var password:String
    @Column private lateinit var enabled: EnabledEnum

    @ManyToMany
    @JoinTable(name = USER_ROLE_LINK_TABLE_NAME ,
            joinColumns = [JoinColumn(name = "userId")] ,
            inverseJoinColumns = [JoinColumn(name = "roleId")])
    private lateinit var roles: List<Role>

    override fun toString(): String {
        return "${super.toString()} User(username='$username', email='$email', password='$password', enabled=$enabled, roles=$roles)"
    }

    companion object {
        const val USER_TABLE_NAME = "`user`"
    }
}