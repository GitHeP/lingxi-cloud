package com.github.lingxi.cloud.admin.service.dto

/**
 *
 * @author he peng
 * @date 2020/8/17
 */
data class AuthorityListDTO(var icon:String? , var resource: String? , var action: String?
                            , var order: Int? , var createTime:String? , var modifyTime:String?) {

    constructor() : this(null , null , null , null ,null , null)
}