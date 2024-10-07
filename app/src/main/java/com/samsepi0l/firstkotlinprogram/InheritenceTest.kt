package com.samsepi0l.firstkotlinprogram

fun main() {

  //Creating an obj from Car class
  var car = Car()
  car.type = "Car";
  car.model = "Ferrari";
  car.maxSpeed = 320;

  car.show();

  //Creating an object from Bike class
  var bike = Bike();
  bike.type = "Bike";
  bike.model = "Honda";
  bike.maxSpeed = 150;

  bike.show();
}