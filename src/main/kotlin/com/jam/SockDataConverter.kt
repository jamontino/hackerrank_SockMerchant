package com.jam

object SockDataConverter {

    fun convert(args: Array<String>): SockData {
        if (args.isEmpty())
            throw Exception("No parameters received!")
        val sockData = SockData((args[0].toInt()), (args.drop(1).map { it.toInt() }))

        when {
            sockData.sockList.isEmpty() -> throw Exception("Sock List should not be empty!")
            !sockData.sockList.size.equals(sockData.sockCount) -> throw Exception("Provided sock count does not match sock-list size!")
        }

        return sockData
    }
}