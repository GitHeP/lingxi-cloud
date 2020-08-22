package com.github.lingxi.cloud.admin.service.query

import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Component

data class DataTablesPageQuery(var draw: String = "" , var start: Int, var length: Int) {

    companion object {
        const val MAX_PAGE_SIZE = 300
    }
}

@Component
class DataTablesPageQueryMapper {

    fun pageQueryToPageRequest(s: DataTablesPageQuery): PageRequest =
            PageRequest.of(s.start , if(s.length > DataTablesPageQuery.MAX_PAGE_SIZE) DataTablesPageQuery.MAX_PAGE_SIZE else s.length)
}


