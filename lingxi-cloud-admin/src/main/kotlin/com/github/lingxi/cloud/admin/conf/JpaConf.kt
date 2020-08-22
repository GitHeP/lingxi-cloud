package com.github.lingxi.cloud.admin.conf

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

/**
 *
 * @author he peng
 * @date 2020/8/22
 */

@Configuration
@EnableJpaRepositories(
        repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean::class
        , basePackages = ["com.github.lingxi.cloud.admin.dao"])
class JpaConf