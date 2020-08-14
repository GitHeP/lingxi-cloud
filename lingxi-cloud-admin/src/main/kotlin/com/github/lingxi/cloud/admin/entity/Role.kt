package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum
import com.github.lingxi.cloud.admin.entity.Role.Companion.ROLE_TABLE_NAME
import javax.persistence.Column
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = ROLE_TABLE_NAME)
class Role(id: Long, createTime: Long, modifyTime: Long, deleted: DeletedEnum
           , @Column private var nickname: String, @Column private var code: String)
    : Entity(id , createTime , modifyTime,deleted) {

    companion object {
        const val ROLE_TABLE_NAME = "role"
    }

    constructor()

    override fun toString(): String {
        return "${super.toString()} Role(nickname='$nickname', code='$code')"
    }
}