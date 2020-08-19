package com.github.lingxi.cloud.admin.controller

import com.github.lingxi.cloud.admin.service.AuthorityService
import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import com.github.lingxi.cloud.admin.service.query.PageQuery
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject


@RestController
@RequestMapping("/authority/v1")
class AuthorityControllerV1 {

    @Inject lateinit var authorityService: AuthorityService

    @GetMapping("/list")
    fun listPagingAuthority(pQuery: PageQuery): Page<AuthorityDTO> {
        return authorityService.listPaging(pQuery)
    }
}