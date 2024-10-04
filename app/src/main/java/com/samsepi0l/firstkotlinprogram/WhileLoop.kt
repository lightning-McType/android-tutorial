package com.samsepi0l.firstkotlinprogram

import kotlin.random.Random

fun main() {
  /*
  var i = 5;
  //factorial of first five number

  var k = 1;
  var fact = 1;
  while (k < 6) {
    fact *= k;
    println("$k! = $fact");
    k++;
  }
   */

  val num = Random.nextInt(0, 10);
  print("Please enter a number: ")

  while (true) {
    val userGuess = readln().toInt();
    if (userGuess == num) {
      println("Congratzzz!!! You've guessed it right")
      break;
    } else if (userGuess < num) {
      println("Your guess is too low")
    } else {
      println("Your guess is too high")
    }
  }
}