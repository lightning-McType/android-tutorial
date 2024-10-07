package com.samsepi0l.firstkotlinprogram.override

fun main() {
  val vehicle = Vehicle();
  vehicle.start();
  vehicle.accelerate(80);
  vehicle.stop();
  println()
  val car = Car();
  car.start();
  car.accelerate(120);
  car.stop();
  println()
  car.superStart();
  car.superAccelerate();
  car.superStop();
}