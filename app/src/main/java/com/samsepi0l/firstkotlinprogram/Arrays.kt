package com.samsepi0l.firstkotlinprogram

fun main(args: Array<String>) {
  val age = arrayOf(1, 2, 3);

  println(age[0]);
  println(age[1]);
  println(age[2]);

  println("size of age array is ${age.size}")

  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda");

  println(cars[0]);
  println(cars[1]);
  println(cars[2]);
  println(cars[3]);

  println("size of cars array is ${cars.size}");

  cars[2] = "Opel";

  println("cars[2] is ${cars[2]}");

  val carsAndAge = arrayOf("Volvo", 1, "BMW", 2, "Ford", 3, "Mazda", 4);


  println("size of carsAndAge array is ${carsAndAge.size}")
  println(carsAndAge[0]);
  println(carsAndAge[1]);
  println(carsAndAge[2]);
  println(carsAndAge[3]);
  println(carsAndAge[4]);
  println(carsAndAge[5]);
  println(carsAndAge[6]);
  println(carsAndAge[7]);



}
