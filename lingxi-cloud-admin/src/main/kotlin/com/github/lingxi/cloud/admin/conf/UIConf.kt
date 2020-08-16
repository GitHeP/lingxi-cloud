package com.github.lingxi.cloud.admin.conf

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.ResourceHandlerRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer


@Configuration
class UIConf {

    companion object {
        const val UI_RESOURCE_LOCATION = "classpath:META-INF/lingxi-cloud-admin-ui/AdminLTE/"

        @Configuration(proxyBeanMethods = false)
        @ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.REACTIVE)
        class ReactiveUIConf : WebFluxConfigurer {

            override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
                registry.addResourceHandler("/c/**")
                    .addResourceLocations(UI_RESOURCE_LOCATION)
            }
        }
    }
}