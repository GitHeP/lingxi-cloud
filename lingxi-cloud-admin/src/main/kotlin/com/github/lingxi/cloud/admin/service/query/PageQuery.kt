package com.github.lingxi.cloud.admin.service.query

import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Component

data class PageQuery(var page: Int, var size: Int) {

    companion object {
        const val MAX_PAGE_SIZE = 300
    }
}

@Component
class PageQueryMapper {

    fun pageQueryToPageRequest(s: PageQuery): PageRequest = PageRequest.of(s.page , if(s.size > PageQuery.MAX_PAGE_SIZE) PageQuery.MAX_PAGE_SIZE else s.size)
}


