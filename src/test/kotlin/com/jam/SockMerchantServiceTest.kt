package com.jam

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SockMerchantServiceTest {

    @Test
    internal fun getNumberOfPairs() {
        assertEquals(1, SockMerchantService(SockData(3, listOf(1, 1, 2))).getNumberOfPairs())
        assertEquals(2, SockMerchantService(SockData(6, listOf(1, 1, 1, 2, 2, 3))).getNumberOfPairs())
        assertEquals(3, SockMerchantService(SockData(1, listOf(8, 3, 3, 6, 8, 9, 1, 1, 4, 2, 5))).getNumberOfPairs())
    }
}