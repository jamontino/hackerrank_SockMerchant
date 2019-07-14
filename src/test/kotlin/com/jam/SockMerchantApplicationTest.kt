package com.jam

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class SockMerchantApplicationTest {

    private lateinit var testSubject: SockMerchantApplication

    @BeforeEach
    internal fun setUp() {
        testSubject = SockMerchantApplication()

    }

    @Test
    fun run() {
        testSubject.run()
    }
}