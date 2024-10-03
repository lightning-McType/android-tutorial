package com.samsepi0l.firstkotlinprogram

fun main(args: Array<String>) {
  /*

  val setArray = arrayListOf("Kotlin", 2, 2.5, "K", true, "Kotlin");

  println(setArray.size);  //6
  println(setArray.last());  //Kotlin

   */

  val setArray = setOf("Kotlin", 2, 2.5, "K", true, "Kotlin");
  println(setArray.size);
  println(setArray.last());
}