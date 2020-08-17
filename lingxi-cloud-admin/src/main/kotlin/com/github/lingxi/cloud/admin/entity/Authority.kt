package com.github.lingxi.cloud.admin.entity

import com.github.lingxi.cloud.admin.entity.Authority.Companion.AUTHORITY_TABLE_NAME
import com.github.lingxi.cloud.admin.pojo.dto.AuthorityListDTO
import org.mapstruct.IterableMapping
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

    @Column private lateinit var resource: String
    @Column private lateinit var action: String
    @Column private var parentId: Long? = null
    @Column private lateinit var icon: String
    @Column private var order: Int? = null

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
        Mapping(source = "createTime" , target = "createTime" , dateFormat = "yyyy-MM-dd HH:mm:ss")
        ,Mapping(source = "modifyTime" , target = "modifyTime" , dateFormat = "yyyy-MM-dd HH:mm:ss")])
    fun authorityToAuthorityListDTO(authority: Authority): AuthorityListDTO

    @Mappings(value = [
        Mapping(source = "createTime" , target = "createTime" , dateFormat = "yyyy-MM-dd HH:mm:ss")
        ,Mapping(source = "modifyTime" , target = "modifyTime" , dateFormat = "yyyy-MM-dd HH:mm:ss")])
    @IterableMapping
    fun authorityListToAuthorityListDTOList(authorityList: List<Authority>): List<AuthorityListDTO>
}