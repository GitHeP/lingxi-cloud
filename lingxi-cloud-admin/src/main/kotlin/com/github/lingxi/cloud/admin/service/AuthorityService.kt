package com.github.lingxi.cloud.admin.service

import com.github.lingxi.cloud.admin.service.dto.AuthorityListDTO
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

/**
 *
 * @author he peng
 * @date 2020/8/17
 */
interface AuthorityService {

    fun listPaging(page: Pageable): Page<AuthorityListDTO>
}