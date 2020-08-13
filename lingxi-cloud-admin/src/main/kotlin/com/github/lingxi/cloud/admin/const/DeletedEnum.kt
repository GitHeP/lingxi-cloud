package com.github.lingxi.cloud.admin.const

/**
 *
 * @author he peng
 * @date 2020/8/13
 */
enum class DeletedEnum(val v: Byte , val msg: String) {

    DELETED(0 , "deleted") ,

    NOT_DELETED(1 , "not deleted")
}