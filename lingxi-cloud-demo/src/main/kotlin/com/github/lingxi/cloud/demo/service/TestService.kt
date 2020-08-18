package com.github.lingxi.cloud.demo.service

import com.github.lingxi.cloud.demo.entity.TestEntity

/**
 *
 * @author he peng
 * @date 2020/8/18
 */
interface TestService {

    fun txTest(cmd: String): TestEntity?
}