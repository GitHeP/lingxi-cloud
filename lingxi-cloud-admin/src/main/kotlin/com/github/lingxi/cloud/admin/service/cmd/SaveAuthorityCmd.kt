package com.github.lingxi.cloud.admin.service.cmd

import java.io.Serializable
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern

/**
 *
 * @author he peng
 * @date 2020/10/9
 */
data class SaveAuthorityCmd(
        @Pattern(regexp = "[1-9]\\d*") var parentId: Long?
        , var icon: String?, var resource: String?, var action: String?
        , @Pattern(regexp = "[1-9]\\d*") var order: Int?) : Serializable