package com.jam

class SockMerchantService(private val sockData: SockData) {

    fun getNumberOfPairs(): Int {
        var pairCount = 0
        var lastSock: Int? = null

        for (currentSock: Int in sockData.sockList.sorted()) {
            if (currentSock.equals(lastSock)) {
                pairCount += 1
                lastSock = null
            } else {
                lastSock = currentSock
            }
        }
        return pairCount
    }

}
