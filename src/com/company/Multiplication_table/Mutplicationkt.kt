package com.company.Multiplication_table

fun main(args: Array<String>) {
    val m = mutip()
    println(m)

}
fun mutip(){
    val n = readLine()!!.toInt()
    for (i in 0..10){
        println("$n x $i = ${n*i}")
    }
}