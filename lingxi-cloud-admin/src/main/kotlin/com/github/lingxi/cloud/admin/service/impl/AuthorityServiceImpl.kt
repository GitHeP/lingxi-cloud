package com.github.lingxi.cloud.admin.service.impl

import com.github.lingxi.cloud.admin.dao.AuthorityDAO
import com.github.lingxi.cloud.admin.entity.Authority
import com.github.lingxi.cloud.admin.entity.AuthorityMapper
import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import com.github.lingxi.cloud.admin.service.AuthorityService
import com.github.lingxi.cloud.admin.service.query.DataTablesPageQuery
import com.github.lingxi.cloud.admin.service.query.DataTablesPageQueryMapper
import org.springframework.beans.BeanUtils
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.jpa.datatables.mapping.DataTablesInput
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput
import org.springframework.stereotype.Service
import javax.inject.Inject

/**
 *
 * @author he peng
 * @date 2020/8/17
 */

@Service
class AuthorityServiceImpl : AuthorityService {

    @Inject
    private lateinit var entityMapper: AuthorityMapper

    @Inject
    private lateinit var pageQueryMapper: DataTablesPageQueryMapper

    @Inject
    private lateinit var authorityDAO: AuthorityDAO

    override fun listPaging(datatable: DataTablesInput): DataTablesOutput<AuthorityDTO> {

        val dataTablesOutput = authorityDAO.findAll(datatable)
        return DataTablesOutput<AuthorityDTO>().apply {
            BeanUtils.copyProperties(dataTablesOutput , this)
            data = entityMapper.authoritysToAuthorityDTOs(dataTablesOutput.data)
        }
    }
}