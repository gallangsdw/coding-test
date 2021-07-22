package com.gallang.codingtest

import org.junit.Test

class HelloWorldTest {

    fun helloWorld(max: Int) {
        for (i in 1..max) {
            if (i % 3 == 0 && i % 5 == 0) {
                println(HELLO + WORLD)
            } else if (i % 3 == 0) {
                println(HELLO)
            } else if (i % 5 == 0) {
                println(WORLD)
            } else {
                println(i)
            }
        }
    }

    companion object {
        const val HELLO = "Hello "
        const val WORLD = "World"
    }

    @Test
    fun testHelloWorld() {
        helloWorld(100)
    }
}