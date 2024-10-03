package com.samsepi0l.firstkotlinprogram

fun main(args: Array<String>) {
  val age = ArrayList<Int>();
  age.add(10);
  age.add(1, 15);
  age.add(20);
  age.add(25);
  age.add(30);
  println(age);

  age.remove(15);
  println("After removing 15")
  println(age);

  println("\nusing arrayListOf method");

  val cars = arrayListOf("BMW", "Benz", "Audi");
  println(cars);

  println("\nmixed datatype arraylist")
  val mixArray = ArrayList<Any>();
  mixArray.add("Ford");
  mixArray.add("BMW");
  mixArray.add(10);
  mixArray.add(20);
  mixArray.add(true);
  println(mixArray);
}