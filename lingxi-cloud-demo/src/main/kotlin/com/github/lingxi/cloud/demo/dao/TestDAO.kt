package com.github.lingxi.cloud.demo.dao

import com.github.lingxi.cloud.demo.entity.TestEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 * @author he peng
 * @date 2020/8/18
 */

@Repository
interface TestDAO : JpaRepository<TestEntity , Long> {
}