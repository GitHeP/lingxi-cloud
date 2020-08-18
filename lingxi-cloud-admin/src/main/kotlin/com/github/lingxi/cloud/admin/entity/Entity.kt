package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.const.DeletedEnum
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.MappedSuperclass

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@MappedSuperclass
abstract class Entity() {

    @Id var id:Long? = null

    @Column(nullable = false) var createTime:Long? = null

    @Column(nullable = false) var modifyTime:Long? = null

    @Column(nullable = false) lateinit var deleted:DeletedEnum

    constructor(id: Long , createTime:Long , modifyTime:Long , deleted: DeletedEnum) : this() {
        this.id = id
        this.createTime = createTime
        this.modifyTime = modifyTime
        this.deleted = deleted
    }

    override fun toString(): String {
        return "Entity(id=$id, createTime=$createTime, modifyTime=$modifyTime, deleted=$deleted)"
    }
}

