package com.github.lingxi.cloud.demo.controller

import com.github.lingxi.cloud.demo.entity.TestEntity
import com.github.lingxi.cloud.demo.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
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

//    @Value("""${'$'}{helloMsg}""")
    lateinit var helloMsg: String

    @Autowired lateinit var testService: TestService

    @GetMapping("/hello")
    fun hello(): ResponseEntity<Map<String , Any?>> {
        return ResponseEntity.ok(HashMap<String , Any>().apply { this["msg"] = helloMsg })
    }

    @GetMapping("/test/tx-event/{cmd}")
    fun txEventTest(@PathVariable cmd: String): ResponseEntity<Map<String , Any?>> {
        return ResponseEntity.ok(HashMap<String , Any?>().apply { this["entity"] = testService.txTest(cmd)})
    }

}