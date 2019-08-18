package com.jam

class SockMerchantApplication(val args: Array<String>) {

    fun run() {
        val service = SockMerchantService(SockMerchantUtil.getSockCount(args), SockMerchantUtil.getSockList(args))
        val numberOfPairs = service.getNumberOfPairs()
        println(numberOfPairs)
    }
}