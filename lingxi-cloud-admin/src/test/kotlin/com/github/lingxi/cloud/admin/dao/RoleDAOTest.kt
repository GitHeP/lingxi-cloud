package com.github.lingxi.cloud.admin.dao

import com.github.lingxi.cloud.admin.LingXiCloudAdminApplicationTests
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("dev")
class RoleDAOTest : LingXiCloudAdminApplicationTests() {

    @Autowired
    lateinit var roleDAO: RoleDAO

    @Test
    fun query0() {
        val role = roleDAO.getOne(1)
        println("--------------------------- $role")
    }
}