package com.samsepi0l.firstkotlinprogram.abstracT

fun main() {
  //var vehicle = Vehicle()
  var car = Car(2021);
  car.speed = 300;

  println("Name: ${car.vehicleName("Ferrari")}\n" +
          "Type: ${car.vehicleType("Car")}\n" +
          "Model: ${car.model}\n" +
          "Speed: ${car.speed}");
}