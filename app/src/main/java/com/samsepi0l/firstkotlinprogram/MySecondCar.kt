package com.samsepi0l.firstkotlinprogram

class MySecondCar {
  var name: String? = null
  var model: Int? = null
    private set

  constructor(name: String?, model: Int?) {
    this.name = name
    this.model = model
  }
}