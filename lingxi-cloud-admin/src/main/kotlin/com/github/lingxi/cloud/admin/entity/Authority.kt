package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.entity.Authority.Companion.AUTHORITY_TABLE_NAME
import javax.persistence.Column
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = AUTHORITY_TABLE_NAME)
class Authority : Entity() {

    @Column private lateinit var resource: String
    @Column private lateinit var action: String

    override fun toString(): String {
        return "${super.toString()} Authority(resource='$resource', action='$action')"
    }

    companion object {
        const val AUTHORITY_TABLE_NAME = "authority"
    }
}