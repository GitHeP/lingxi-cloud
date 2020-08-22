package com.github.lingxi.cloud.admin.dao

import com.github.lingxi.cloud.admin.entity.Authority
import org.springframework.data.jpa.datatables.repository.DataTablesRepository
import org.springframework.stereotype.Repository

/**
 *
 * @author he peng
 * @date 2020/8/14
 */

@Repository
interface AuthorityDAO : DataTablesRepository<Authority, Long> {
}