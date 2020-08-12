package com.github.lingxi.cloud.demo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author he peng
 * @date 2020/8/12
 */

@RestController
@RequestMapping("/demo")
@RefreshScope
class DemoController {

    @Value("""${'$'}{helloMsg}""")
    lateinit var helloMsg: String

    @GetMapping("/hello")
    fun hello(): ResponseEntity<Map<String , Any?>> {
        return ResponseEntity.ok(HashMap<String , Any>().apply { this["msg"] = helloMsg })
    }


}