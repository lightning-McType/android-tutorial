package com.samsepi0l.firstkotlinprogram.abstracT

class Car(override var model: Int) : Vehicle() {
  override fun vehicleName(name: String): String {
    return name;
  }
}