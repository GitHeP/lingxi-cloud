package com.github.lingxi.cloud.demo.thread

import org.joor.Reflect
import org.junit.jupiter.api.Test

class ThreadTests {



    @Test fun test() {
        val t1 = Thread(Runnable {
            AClass().set("Thread-1-V")
            Thread.sleep(1000000)
        })
        t1.start()


        val t2 = Thread(Runnable {
            BClass().set(100)
        })

        t2.start()

        val declaredFields = t1::class.java.declaredFields
        for (declaredField in declaredFields) {
            declaredField.isAccessible = true
            println("${declaredField.name} = ${declaredField.get(t1)}")
        }


        val df = t1::class.java.getDeclaredField("threadLocals")
        df.isAccessible = true
        val tlMap = df.get(t1)
        Reflect.on(tlMap).call("set" , BClass.tl , 6666)


        val v = Reflect.on(tlMap).call("getEntry" , BClass.tl).get<Any>("value")
        println("value = $v")



        Thread.sleep(600000000)

//        val threadLocals = Reflect.on(t1).get<Any>("threadLocals")
//        println(threadLocals)


    }
}

class AClass {
    companion object {

        val tl: ThreadLocal<String> = ThreadLocal()

    }

    fun set(v: String) = tl.set(v)

    fun get(): String = tl.get()

    fun remove() = tl.remove()
}

class BClass {

    companion object {

        val tl: ThreadLocal<Int> = ThreadLocal()

    }

    fun set(v: Int) = tl.set(v)

    fun get(): Int = tl.get()

    fun remove() = tl.remove()
}