package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum
import com.github.lingxi.cloud.admin.const.EnabledEnum

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

class User(var username: String, var email: String, var enabled: EnabledEnum
           , deleted: DeletedEnum, id: Long, createTime: Long, modifyTime: Long) : Entity(id , createTime , modifyTime , deleted) {

    override fun toString(): String {
        return "${super.toString()} User(username='$username', email='$email', enabled=$enabled)"
    }
}