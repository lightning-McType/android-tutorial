package com.samsepi0l.firstkotlinprogram

open class Vehicle {
  var type: String? = null;
  var model: String? = null;
  var maxSpeed: Int? = null;

  fun show() {
    println("Type is $type");
    println("Model is $model");
    println("Max Speed is $maxSpeed");
  }
}