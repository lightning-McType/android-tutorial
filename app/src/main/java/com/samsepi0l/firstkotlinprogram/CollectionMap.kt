package com.samsepi0l.firstkotlinprogram

fun main() {

  //immutable
  val age = mapOf("david" to 20, "ronaldo" to 25);
  println(age);

  println("\nAccessing keys");
  println("age of David: ${age["david"]}");
  println("age of Ronaldo: ${age["ronaldo"]}");

  //mutable
  val mutableAge = mutableMapOf("david" to 20, "ronaldo" to 25);

  //mutableAge.put("Buffon", 30);
  mutableAge["Buffon"] = 30;

  println("age of Buffon: ${mutableAge["Buffon"]}");
}