package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum

/**
 *
 * @author he peng
 * @date 2020/8/13
 */
class Authority(id: Long , createTime: Long , modifyTime: Long
                , deleted: DeletedEnum , private var resource: String
                , private var action: String) : Entity(id , createTime , modifyTime , deleted) {

    override fun toString(): String {
        return "${super.toString()} Authority(resource='$resource', action='$action')"
    }
}