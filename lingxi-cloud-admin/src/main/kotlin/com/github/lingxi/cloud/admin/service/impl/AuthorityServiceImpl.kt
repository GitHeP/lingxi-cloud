package com.github.lingxi.cloud.admin.service.impl

import com.github.hammer.commons.rcode.GeneralRCode
import com.github.hammer.commons.rcode.RCode
import com.github.hammer.commons.rcode.Result
import com.github.hammer.commons.rcode.ResultImpl
import com.github.lingxi.cloud.admin.dao.AuthorityDAO
import com.github.lingxi.cloud.admin.entity.AuthorityMapper
import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import com.github.lingxi.cloud.admin.service.AuthorityService
import com.github.lingxi.cloud.admin.service.cmd.ModifyAuthorityCmd
import com.github.lingxi.cloud.admin.service.cmd.SaveAuthorityCmd
import com.github.lingxi.cloud.admin.service.query.DataTablesPageQueryMapper
import org.springframework.beans.BeanUtils
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

    override fun listPaging(datatable: DataTablesInput): Result<DataTablesOutput<AuthorityDTO> , RCode> {

        val dataTablesOutput = authorityDAO.findAll(datatable)
        return ResultImpl(DataTablesOutput<AuthorityDTO>().apply {
            BeanUtils.copyProperties(dataTablesOutput , this)
            data = entityMapper.authoritysToAuthorityDTOs(dataTablesOutput.data)
        } , GeneralRCode.SUCCEEDED)
    }

    override fun modifyAuthorityById(cmd: ModifyAuthorityCmd): Result<Long, RCode> {
        val entity = authorityDAO.save(entityMapper.modifyAuthorityCmdToAuthority(cmd))
        return ResultImpl(entity.id , GeneralRCode.SUCCEEDED)
    }

    override fun save(cmd: SaveAuthorityCmd): Result<AuthorityDTO, RCode> {
        val entity = authorityDAO.save(entityMapper.saveAuthorityCmdToAuthority(cmd))
        return ResultImpl(entityMapper.authorityToAuthorityDTO(entity) , GeneralRCode.SUCCEEDED)
    }
}