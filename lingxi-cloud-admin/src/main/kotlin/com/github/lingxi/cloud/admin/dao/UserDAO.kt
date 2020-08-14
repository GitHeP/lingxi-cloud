package com.github.lingxi.cloud.admin.dao

import com.github.lingxi.cloud.admin.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 * @author he peng
 * @date 2020/8/14
 */

@Repository
interface UserDAO : JpaRepository<User, Long> {
}