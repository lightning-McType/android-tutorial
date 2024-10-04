package com.samsepi0l.firstkotlinprogram

fun main() {
  print("Enter a day number of the week: ");

  var dayNum = readln().toInt();
  var day = "";

  day = when (dayNum) {
    1 -> "Monday";
    2 -> "Tuesday";
    3 -> "Wednesday";
    4 -> "Thursday";
    5 -> "Friday";
    6 -> "Saturday";
    7 -> "Sunday";
    else -> "Invalid day number";
  }

  println(day)
}