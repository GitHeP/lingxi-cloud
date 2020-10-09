package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.entity.Authority.Companion.AUTHORITY_TABLE_NAME
import com.github.lingxi.cloud.admin.service.cmd.ModifyAuthorityCmd
import com.github.lingxi.cloud.admin.service.cmd.SaveAuthorityCmd
import com.github.lingxi.cloud.admin.service.dto.AuthorityDTO
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import javax.persistence.Column
import javax.persistence.Table

/**
 *
 * @author he peng
 * @date 2020/8/13
 */

@javax.persistence.Entity
@Table(name = AUTHORITY_TABLE_NAME)
class Authority : Entity() {

    @Column lateinit var resource: String
    @Column lateinit var action: String
    @Column var parentId: Long? = null
    @Column lateinit var icon: String
    @Column var order: Int? = null

    override fun toString(): String {
        return "${super.toString()} Authority(resource='$resource', action='$action', parentId=$parentId, icon='$icon' , order='$order')"
    }

    companion object {
        const val AUTHORITY_TABLE_NAME = "authority"
    }
}

@Mapper(componentModel = "spring")
interface AuthorityMapper {

    @Mappings(value = [
        Mapping(target = "createTime" , expression = "java( new org.joda.time.DateTime(s.getCreateTime()).toString(\"yyyy-MM-dd HH:mm:ss\") )")
        , Mapping(target = "modifyTime" , expression = "java( new org.joda.time.DateTime(s.getModifyTime()).toString(\"yyyy-MM-dd HH:mm:ss\") )")])
    fun authorityToAuthorityDTO(s: Authority): AuthorityDTO

    fun authoritysToAuthorityDTOs(s: List<Authority>): List<AuthorityDTO>

    @Mappings(value = [
        Mapping(target = "modifyTime" , expression = "java( System.currentTimeMillis() )")])
    fun modifyAuthorityCmdToAuthority(s: ModifyAuthorityCmd): Authority

    @Mappings(value = [
        Mapping(target = "createTime" , expression = "java( System.currentTimeMillis() )")])
    fun saveAuthorityCmdToAuthority(s: SaveAuthorityCmd): Authority
}