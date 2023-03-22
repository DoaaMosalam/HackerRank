package com.company.LetsReview
/*Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Example
Print abc def

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a string, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak*/
fun main(){
val review = com.company.LetsReview.LetsReview()
    println(review.Solution())

}
class LetsReview {
    fun Solution(){
        println("Enter number: ")
        val input = readLine()!!.toInt()

        for (i in 1..input){
            var s=""
            var odd=""
            var even=""
//            println("Enter words: ")
            s = readLine().toString()
            for ( j in s.indices){
                if (j%2 ==0){
                    even +=s[j]
                }else{
                    odd +=s[j]
                }
            }
            println("$even $odd")
             even = ""
            odd = ""
        }

    }

}