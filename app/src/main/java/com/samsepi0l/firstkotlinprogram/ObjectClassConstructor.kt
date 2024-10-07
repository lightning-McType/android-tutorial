package com.samsepi0l.firstkotlinprogram

fun main() {
  /*
  val myCar = Cars();
  myCar.name = "Ferrari";
  myCar.model = 2021;

  val myCar2 = Cars();
  myCar2.name = "BMW";
  myCar2.model = 2022;

  println("My car is ${myCar.name} and the model is ${myCar.model}")
  println("My car is ${myCar2.name} and the model is ${myCar2.model}")

   */

  val myNewCar = MyCars("Ferrari", 2021)
  println("My car is ${myNewCar.name} and the model is ${myNewCar.model}")

  var mySecondCar = MySecondCar("BMW", 2022)
  println("My car is ${mySecondCar.name} and the model is ${mySecondCar.model}")

  mySecondCar.name = "Opel";
  //mySecondCar.model = 2021;

  println("My car is ${mySecondCar.name} and the model is ${mySecondCar.model}")

}