package com.github.lingxi.cloud.admin.controller

import com.github.lingxi.cloud.admin.controller.vo.DataTablesVO
import com.github.lingxi.cloud.admin.controller.vo.PageMapper
import com.github.lingxi.cloud.admin.service.AuthorityService
import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import com.github.lingxi.cloud.admin.service.query.DataTablesPageQuery
import org.springframework.data.domain.Page
import org.springframework.data.jpa.datatables.mapping.DataTablesInput
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput
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

    @Inject lateinit var pageMapper: PageMapper

    @PostMapping("/list")
    fun listPagingAuthority(@RequestBody datatable: DataTablesInput): DataTablesOutput<AuthorityDTO>? {
        return authorityService.listPaging(datatable).data()
    }
}