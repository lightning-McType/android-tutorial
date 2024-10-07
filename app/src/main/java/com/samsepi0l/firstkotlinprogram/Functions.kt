package com.samsepi0l.firstkotlinprogram

fun main() {
  print("Enter the first number: ");
  val num1 = readln().toInt()
  print("Enter the second number: ");
  val num2 = readln().toInt()
  show(num1, num2)
  println("Sum of $num1 and $num2 is ${add(num1, num2)}")
  println("Minimum of $num1 and $num2 is ${findMin(num1, num2)}")
}

fun show(num1: Int, num2: Int) {
  println("You entered $num1 and $num2")
}

fun add(num1: Int, num2: Int): Int {
  return num1 + num2
}

fun findMin(num1: Int, num2: Int): Int {
  return if (num1 < num2) num1 else num2
}