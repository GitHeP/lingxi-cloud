package com.github.lingxi.cloud.admin.dao

import com.github.lingxi.cloud.admin.entity.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 * @author he peng
 * @date 2020/8/14
 */

@Repository
interface RoleDAO : JpaRepository<Role, Long> {
}