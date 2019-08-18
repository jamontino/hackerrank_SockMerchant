package com.jam

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SockDataConverterTest {

    @Test
    internal fun initialize() {
        assertInitialization(arrayOf(), "No parameters received!")
        assertInitialization(arrayOf("1"), "Sock List should not be empty!")
        assertInitialization(arrayOf("1","1","1","1"), "Provided sock count does not match sock-list size!")
        assertInitialization(arrayOf("0","1","1","1"), "Provided sock count does not match sock-list size!")
    }

    private fun assertInitialization(inputArgs: Array<String>, expectedMessage: String) {
        try {
            SockDataConverter.convert(inputArgs)
            fail<Exception>("Expected exception not thrown")
        } catch (e: Exception) {
            assertTrue(e.message?.contains(expectedMessage) ?: false)
        }
    }
}