package com.samsepi0l.firstkotlinprogram

fun main() {
  print("Enter a number: ")
  val number = readln().toInt();
  if (number % 2 == 0) {
    println("$number is even")
  } else {
    println("$number is odd")
  }
}