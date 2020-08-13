package com.github.lingxi.cloud.admin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAdminServer
class LingXiCloudAdminApplication

fun main(args: Array<String>) {
    runApplication<LingXiCloudAdminApplication>(*args)
}
