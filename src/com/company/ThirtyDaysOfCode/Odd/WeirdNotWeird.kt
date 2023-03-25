package com.company.ThirtyDaysOfCode.Odd

fun main(){
    val N:Int = readLine()!!.toInt()
    if (N % 2 != 0){
        println("Weird")
    }else{
        when(N){
            in 2..5 -> println("Not Weird")
            in 6..20 -> println("Weird")
            else -> println("Not Weird")
        }
    }

}