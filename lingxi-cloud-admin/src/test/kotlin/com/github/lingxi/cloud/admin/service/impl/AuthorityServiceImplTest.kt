package com.github.lingxi.cloud.admin.service.impl

import com.github.lingxi.cloud.admin.LingXiCloudAdminApplicationTests
import com.github.lingxi.cloud.admin.service.AuthorityService
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.data.domain.PageRequest
import org.springframework.test.context.ActiveProfiles
import javax.inject.Inject

/**
 * @author he peng
 * @date 2020/8/17
 */

@ActiveProfiles("dev")
internal class AuthorityServiceImplTest : LingXiCloudAdminApplicationTests() {

    @Inject lateinit var service: AuthorityService

    @Test
    fun listPaging() {
        var page = service.listPaging(PageRequest.of(0 , 20))
        println(page)
    }
}