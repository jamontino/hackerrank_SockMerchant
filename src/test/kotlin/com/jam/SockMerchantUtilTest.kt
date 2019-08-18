package com.jam

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SockMerchantUtilTest {

    @Test
    fun getSockCount() {
        val actual: Int = SockMerchantUtil.getSockCount(arrayOf("3", "1", "2", "3"))
        assertEquals(3, actual)
    }

    @Test
    fun getSockList() {
        val actual: List<Int> = SockMerchantUtil.getSockList(arrayOf("3", "1", "1", "2"))
        assertEquals(listOf(1, 1, 2), actual)
    }
}