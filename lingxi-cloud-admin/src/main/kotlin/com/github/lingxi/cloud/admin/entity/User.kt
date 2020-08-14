package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum
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
class User(@Column var username: String, @Column var email: String, @Column var password:String, @Column var enabled: EnabledEnum
           , deleted: DeletedEnum, id: Long, createTime: Long, modifyTime: Long) : Entity(id , createTime , modifyTime , deleted) {

    companion object {
        const val USER_TABLE_NAME = "`user`"
    }

    @ManyToMany
    @JoinTable(name = USER_ROLE_LINK_TABLE_NAME ,
            joinColumns = [JoinColumn(name = "userId")] ,
            inverseJoinColumns = [JoinColumn(name = "roleId")])
    private lateinit var roles: List<Role>

    constructor()

    override fun toString(): String {
        return "${super.toString()} User(username='$username', email='$email', password='$password', enabled=$enabled, roles=$roles)"
    }


}