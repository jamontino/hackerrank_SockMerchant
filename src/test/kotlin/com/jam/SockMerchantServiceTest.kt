package com.jam

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SockMerchantServiceTest {

    @Test
    fun validate() {
        try {
            SockMerchantService(1, listOf())
        } catch (e: Exception) {
            assertEquals(e.message, "blah")
        }

    }

    @Test
    internal fun getNumberOfPairs() {
        assertEquals(1, SockMerchantService(0, listOf(1, 1, 2)).getNumberOfPairs())
        assertEquals(2, SockMerchantService(0, listOf(1, 1, 1, 2, 2, 3)).getNumberOfPairs())
        assertEquals(3, SockMerchantService(0, listOf(8, 3, 3, 6, 8, 9, 1, 1, 4, 2, 5)).getNumberOfPairs())
    }
}