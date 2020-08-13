package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum

/**
 *
 * @author he peng
 * @date 2020/8/13
 */
abstract class Entity(private val id: Long, private val createTime: Long
                      , private val modifyTime: Long , private var deleted: DeletedEnum) {

    override fun toString(): String {
        return "Entity(id=$id, createTime=$createTime, modifyTime=$modifyTime, deleted=$deleted)"
    }
}