package com.samsepi0l.firstkotlinprogram.override

open class Vehicle {
  open fun start() {
    println("Vehicle started.");
  }

  open fun accelerate(speed: Int) {
    println("Vehicle accelerates at $speed mph.");
  }

  open fun stop() {
    println("Vehicle has stopped.");
  }
}