package com.example

trait A {
  def x = 1
}
trait B extends A{
  def y = 2
}

class C {
  val instance: B = new B{}
}
