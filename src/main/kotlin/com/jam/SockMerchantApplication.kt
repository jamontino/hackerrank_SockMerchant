package com.jam

class SockMerchantApplication(private val args: Array<String>) {

    fun run() {
        val sockData = SockDataConverter.convert(args)
        val service = SockMerchantService(sockData)
        val numberOfPairs = service.getNumberOfPairs()
        println(numberOfPairs)
    }
}