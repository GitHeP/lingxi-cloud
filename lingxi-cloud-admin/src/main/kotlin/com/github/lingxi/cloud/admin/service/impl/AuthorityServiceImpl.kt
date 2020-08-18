package com.github.lingxi.cloud.admin.service.impl

import com.github.lingxi.cloud.admin.dao.AuthorityDAO
import com.github.lingxi.cloud.admin.entity.AuthorityMapper
import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import com.github.lingxi.cloud.admin.service.AuthorityService
import com.github.lingxi.cloud.admin.service.query.PageQuery
import com.github.lingxi.cloud.admin.service.query.PageQueryMapper
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
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
    private lateinit var pageQueryMapper: PageQueryMapper

    @Inject
    private lateinit var authorityDAO: AuthorityDAO

    override fun listPaging(page: PageQuery): Page<AuthorityDTO> {

        val resultPage = authorityDAO.findAll(pageQueryMapper.pageQueryToPageRequest(page))
        val list = entityMapper.authoritysToAuthorityDTOs(resultPage.content)
        return PageImpl<AuthorityDTO>(list , resultPage.pageable , resultPage.totalElements)
    }
}