package com.github.lingxi.cloud.admin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableAdminServer
@EnableWebFlux
class LingXiCloudAdminApplication

fun main(args: Array<String>) {
    runApplication<LingXiCloudAdminApplication>(*args)
}
