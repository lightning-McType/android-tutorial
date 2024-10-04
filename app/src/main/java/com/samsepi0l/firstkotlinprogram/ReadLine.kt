package com.samsepi0l.firstkotlinprogram

fun main() {
  print("What is your name? ");

  //var name: String? = readLine();
  var name = readlnOrNull();

  print("How old are you? ");

  //var age = readLine()!!.toInt();
  var age = readln().toInt();

  println("Your name is $name and your age is $age")
}