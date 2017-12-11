package com.example

trait A {
  def x = 1
}

class C {
  val instance: A = new A{}
}
