package com.gallang.codingtest

import org.junit.Test

class ReversedTest {

    fun reversed(string: String) {

        val dibalik = string.reversed()
        println("kalimat $string dibalik jadi $dibalik")
    }

    @Test
    fun reversedTest() {
        reversed("gallang")
        reversed("Aplikasi")
    }
}