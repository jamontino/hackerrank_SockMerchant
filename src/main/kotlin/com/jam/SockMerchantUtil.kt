package com.jam

object SockMerchantUtil{
    fun getSockCount(args: Array<String>): Int {
        return args.map { it.toInt() }[0]
    }

    fun getSockList(args: Array<String>): List<Int> {
        return args.drop(1).map { it.toInt() }
    }

}
