package com.github.lingxi.cloud.admin.conf

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain


@Configuration
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
class WebSecurityConf {

    @Bean
    fun springSecurityFilterChain(http: ServerHttpSecurity) : SecurityWebFilterChain {
        return http.apply { this.authorizeExchange().anyExchange().permitAll() }.build()
    }
}