package com.jam

class SockMerchantService(val sockCount: Int, val sockList: List<Int>) {


    fun validate() {
//        throw Exception("blah")
//        if (sockList.isEmpty()){
//            throw Exception("Sock List should not be empty")
//        }
    }

    fun getNumberOfPairs(): Int {
        var pairCount = 0
        var lastSock: Int? = null

        for (currentSock: Int in sockList.sorted()) {
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
