package com.github.lingxi.cloud.demo.service.txevent

import org.springframework.context.ApplicationEvent

/**
 *
 * @author he peng
 * @date 2020/8/18
 */
class TXCommittedEvent(source: Any) : ApplicationEvent(source) {
}