package com.gallang.codingtest

import org.junit.Test
import java.lang.StringBuilder

class PalindromeTest {

   fun palindrome(string: String): Boolean {

       val kalimat = StringBuilder(string)
       val dibalik = kalimat.reverse().toString()

       return string == dibalik
   }

    fun main(input: String) {
        if (palindrome(input)) {
            println("kalimat $input adalah palindrome")
        } else {
            println("kalimat $input bukan palindrome")
        }
    }

    @Test
    fun testPalindrome() {

        main("katak")
        main("gallang")
        main("kodok")
        main("ibu")
    }
}