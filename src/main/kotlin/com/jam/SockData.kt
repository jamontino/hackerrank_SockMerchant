package com.jam

data class SockData(val sockCount: Int, val sockList: List<Int>) {

    fun get(): SockData {
        return SockData(sockCount, sockList)
    }
}