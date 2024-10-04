package com.samsepi0l.firstkotlinprogram

fun main() {
  /*
  print("Enter your age: ");

  var yourAge = readln().toInt();

   if (yourAge < 13) {
     print("You are a child")
   } else if (yourAge < 19) {
     print("You are a teenager")
   } else {
     if (yourAge < 65) {
       print("You are an adult")
     } else {
       print("You are a senior")
     }
   }

   */

  print("Enter 3 numbers : ")

  var num1 = readln().toInt();
  var num2 = readln().toInt();
  var num3 = readln().toInt();

  if (num1 > num2) {
    if (num1 > num3) {
      print("The largest number is $num1")
    } else {
      print("The largest number is $num3")
    }
  } else {
    if (num2 > num3) {
      print("The largest number is $num2")
    } else {
      print("The largest number is $num3")
    }
  }
}