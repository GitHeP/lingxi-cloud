package com.github.lingxi.cloud.admin.service.impl

import com.github.lingxi.cloud.admin.dao.AuthorityDAO
import com.github.lingxi.cloud.admin.entity.AuthorityMapper
import com.github.lingxi.cloud.admin.pojo.dto.AuthorityListDTO
import com.github.lingxi.cloud.admin.service.AuthorityService
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
    private lateinit var authorityDAO: AuthorityDAO

    override fun listPaging(page: Pageable): Page<AuthorityListDTO> {

        val resultPage = authorityDAO.findAll(page)
        val list = entityMapper.authorityListToAuthorityListDTOList(resultPage.content)
        return PageImpl<AuthorityListDTO>(list , resultPage.pageable , resultPage.totalElements)
    }
}