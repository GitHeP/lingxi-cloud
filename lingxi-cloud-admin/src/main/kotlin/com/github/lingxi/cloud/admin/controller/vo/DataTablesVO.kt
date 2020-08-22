package com.github.lingxi.cloud.admin.controller.vo

import org.springframework.data.domain.Page
import org.springframework.stereotype.Component

/**
 *
 * @author he peng
 * @date 2020/8/22
 */
data class DataTablesVO(var draw: String , var recordsTotal: Long , var recordsFiltered: Long , var data: List<Any>) {
}

@Component
class PageMapper {

    fun pageToDataTablesVO(p: Page<out Any>): DataTablesVO = DataTablesVO("" , p.totalElements , p.totalElements , p.content)
}