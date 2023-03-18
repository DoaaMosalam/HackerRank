package com.company.Person

class PersonKt {
    var age=0
    //constructor
  constructor(initialAge:Int){
      if(initialAge >0){
          println("Age is not valid, setting age to 0.")
          this.age=initialAge
      }else{
          this.age=initialAge
      }
  }
    fun yearPasses(){
        age++
    }
    fun amIOld(){
        when{
            age < 13 -> println("You are young.")
            age in 13..17 -> println("You are a teenager.")
            else -> println("You are old.")
        }
    }
}

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    repeat(t){
        val age = readLine()?.toInt() ?: 0
        val person = PersonKt(age)
        person.amIOld()
        repeat(3) {
            person.yearPasses()
        }
        person.amIOld()
        println()
    }
}