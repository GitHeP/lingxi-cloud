package com.github.lingxi.cloud.admin.dao

import com.github.lingxi.cloud.admin.LingXiCloudAdminApplicationTests
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("dev")
class UserDAOTest : LingXiCloudAdminApplicationTests() {

    @Autowired
    lateinit var userDAO: UserDAO

    @Test
    fun query0() {
        val user = userDAO.getOne(1)
        println("--------------------------- $user")
    }
}