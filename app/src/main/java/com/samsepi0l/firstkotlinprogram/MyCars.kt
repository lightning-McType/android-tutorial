package com.samsepi0l.firstkotlinprogram

class MyCars constructor(var name: String, var model: Int) {
  init {
    println("My car is: $name $model")
  }
}