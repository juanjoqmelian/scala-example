package demo

import org.scalatest.FunSuite


class CalculatorTest extends FunSuite {

  test("sum should return zero if two zero values are added") {
    val calculator = new Calculator
    assert(calculator.sum(0, 0) == 0)
  }

  test("sum should add two positive numbers") {
    val calculator = new Calculator
    assert(calculator.sum(2, 5) == 7)
  }

  test("sum should add two negative numbers") {
    val calculator = new Calculator
    assert(calculator.sum(-2, -3) == -5)
  }

  test("sum should a positive and negative number") {
    val calculator = new Calculator
    assert(calculator.sum(-3, 4) == 1)
  }

  test("mult should always return zero multiplying by zero") {
    val calculator = new Calculator
    assert(calculator.mult(6, 0) == 0)
  }

  test("mult should multiply two positive numbers") {
    val calculator = new Calculator
    assert(calculator.mult(2, 4) == 8)
  }

  test("mult should return a positive number multiplying two negative numbers") {
    val calculator = new Calculator
    assert(calculator.mult(-2, -3) == 6)
  }

  test("mult should return a negative number when only one of the arguments is negative") {
    val calculator = new Calculator
    assert(calculator.mult(-2, 3) == -6)
  }

  test("square should return the square of a positive number") {
    val calculator = new Calculator
    assert(calculator.square(3) == 9)
  }

  test("square of a negative number should be a positive number") {
    val calculator = new Calculator
    assert(calculator.square(-3) == 9)
  }

  test("square of zero must be zero") {
    val calculator = new Calculator
    assert(calculator.square(0) == 0)
  }
}
