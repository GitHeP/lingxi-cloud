package com.github.lingxi.cloud.demo.service.impl

import com.github.lingxi.cloud.demo.dao.TestDAO
import com.github.lingxi.cloud.demo.entity.TestEntity
import com.github.lingxi.cloud.demo.service.TestService
import com.github.lingxi.cloud.demo.service.txevent.TXCommittedEvent
import org.aspectj.weaver.ast.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.Exception
import java.lang.RuntimeException

/**
 *
 * @author he peng
 * @date 2020/8/18
 */

@Service
class TestServiceImpl : TestService {

    @Autowired private lateinit var testDAO: TestDAO

    @Autowired private lateinit var eventPublisher: ApplicationEventPublisher

    @Transactional(rollbackFor = [Exception::class])
    override fun txTest(cmd: String): TestEntity? {

        var result: TestEntity? = null
        val te = TestEntity().apply {
            this.deleted = 1
            this.createTime = System.currentTimeMillis()
            this.modifyTime = 0
        }
        result = testDAO.saveAndFlush(te)
        eventPublisher.publishEvent(TXCommittedEvent("test tx event listener"))

        if ("rollback" == cmd) {
            throw RuntimeException("cmd = $cmd")
        }
        return result
    }
}