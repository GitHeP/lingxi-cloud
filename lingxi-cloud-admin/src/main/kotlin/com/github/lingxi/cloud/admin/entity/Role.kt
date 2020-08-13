package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum

/**
 *
 * @author he peng
 * @date 2020/8/13
 */
class Role(id: Long , createTime: Long , modifyTime: Long ,deleted: DeletedEnum
           , private var nickname: String , private var code: String)
    : Entity(id , createTime , modifyTime,deleted) {


    override fun toString(): String {
        return "${super.toString()} Role(nickname='$nickname', code='$code')"
    }
}