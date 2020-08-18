package com.github.lingxi.cloud.demo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/18
 */

@Entity
@Table(name = "test")
class TestEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null
    @Column var deleted:Byte? = null
    @Column var createTime:Long? = null
    @Column var modifyTime:Long? = null
}