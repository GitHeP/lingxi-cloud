package com.github.lingxi.cloud.demo.service.txevent

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener

/**
 *
 * @author he peng
 * @date 2020/8/18
 */

@Component
class TXEventListener {

    companion object {
        val LOG: Logger = LoggerFactory.getLogger(TXEventListener::class.java)
    }

    @TransactionalEventListener
    fun committedEventHandler(event: TXCommittedEvent) {
        LOG.info("=====================> received tx event {} " , event)
    }
}