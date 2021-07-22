package com.gallang.codingtest

import org.junit.Test
import java.util.regex.Pattern.compile

class EmailCheckTest {

    fun main(email: String) {
        val emailRegex = compile(
            "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})")

        val EmailValid = emailRegex.matcher(email).matches()

        println("Email $email is $EmailValid")
    }

    @Test
    fun emailCheckTest() {
        main("gallang@sdw.co.id")
    }
}