package com.samsepi0l.firstkotlinprogram

fun main() {
  /*
  for (num in 1..10) {
    println(num)
  }

  var sum = 0;
  for (x in 1..5) {
    sum += x
  }
  println(sum)

  for (x in numArr) {
    println(x)
  }

  for (idx in 0..<numArr.size) {
    println(numArr[idx])
  }
   */

  /*
  var numArr = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  for (i in numArr.indices) {
    println(numArr[i])
  }
   */

  //for-each loop
  var newNumArr = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  newNumArr.forEach { print("$it ") }
}