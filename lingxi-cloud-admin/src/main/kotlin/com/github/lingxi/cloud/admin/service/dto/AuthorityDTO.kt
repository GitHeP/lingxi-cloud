package com.github.lingxi.cloud.admin.service.dto

import java.io.Serializable

/**
 *
 * @author he peng
 * @date 2020/8/17
 */

data class AuthorityDTO(var id: Long? , var parentId: Long?
                        , var icon: String?, var resource: String?, var action: String?
                        , var order: Int?, var createTime:String?, var modifyTime:String?) : Serializable {

    constructor() : this(null , null,null , null , null , null ,null , null)
}