package com.samsepi0l.firstkotlinprogram.interfaces

fun main() {
  var vehicles = Vehicles()

  println("Name: ${vehicles.name}");
  vehicles.go();
  vehicles.stop();
}