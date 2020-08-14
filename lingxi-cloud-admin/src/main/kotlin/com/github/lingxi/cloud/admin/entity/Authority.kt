package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum
import com.github.lingxi.cloud.admin.entity.Authority.Companion.AUTHORITY_TABLE_NAME
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = AUTHORITY_TABLE_NAME)
class Authority(id: Long , createTime: Long , modifyTime: Long
                , deleted: DeletedEnum , private var resource: String
                , private var action: String) : Entity(id , createTime , modifyTime , deleted) {

    companion object {
        const val AUTHORITY_TABLE_NAME = "authority"
    }

    constructor()

    override fun toString(): String {
        return "${super.toString()} Authority(resource='$resource', action='$action')"
    }
}