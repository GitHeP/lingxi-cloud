package com.github.lingxi.cloud.admin.service

import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import org.springframework.data.jpa.datatables.mapping.DataTablesInput
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput

/**
 *
 * @author he peng
 * @date 2020/8/17
 */
interface AuthorityService {

    fun listPaging(datatable: DataTablesInput): DataTablesOutput<AuthorityDTO>
}