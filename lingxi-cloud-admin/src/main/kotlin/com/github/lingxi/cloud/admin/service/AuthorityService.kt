package com.github.lingxi.cloud.admin.service

import com.github.hammer.commons.rcode.RCode
import com.github.hammer.commons.rcode.Result
import com.github.lingxi.cloud.admin.service.cmd.ModifyAuthorityCmd
import com.github.lingxi.cloud.admin.service.cmd.SaveAuthorityCmd
import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import org.springframework.data.jpa.datatables.mapping.DataTablesInput
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput
import sun.invoke.empty.Empty
import javax.validation.Valid
import javax.validation.constraints.NotNull

/**
 *
 * @author he peng
 * @date 2020/8/17
 */
interface AuthorityService {

    fun listPaging(datatable: DataTablesInput): Result<DataTablesOutput<AuthorityDTO> , RCode>

    fun modifyAuthorityById(@Valid @NotNull cmd: ModifyAuthorityCmd): Result<Long , RCode>

    fun save(@Valid @NotNull cmd: SaveAuthorityCmd): Result<AuthorityDTO , RCode>

}