package com.samsepi0l.firstkotlinprogram

fun main() {
  var myCharRange = 'a'.rangeTo('j');
  var myChar = 'k' in myCharRange;

  var newNumRange = 1.rangeTo(10);
  var newMyNum = 1 in newNumRange;

  var numRange = 1..10;
  var myNum = 5 in numRange;

  println(myChar);
  println(myNum);
  println(newMyNum);
}