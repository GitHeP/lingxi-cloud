package com.github.lingxi.cloud.admin.entity

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
class Role : Entity() {

    @Column private lateinit var nickname: String
    @Column private lateinit var code: String

    override fun toString(): String {
        return "${super.toString()} Role(nickname='$nickname', code='$code')"
    }

    companion object {
        const val ROLE_TABLE_NAME = "role"
    }
}