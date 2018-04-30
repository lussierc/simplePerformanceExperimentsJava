package labten;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labten.computation.IterativeFibonacciComputation;
import labten.computation.RecursiveFibonacciComputation;
import labten.computation.RecursiveFibonacciHashMap;

import labten.computation.IterativeFactorialComputation;
import labten.computation.RecursiveFactorialComputation;

import org.junit.Test;
import java.util.Arrays;

public class TestArithmeticComputations {

  /** The objects used in the test cases. **/

  // Fibonacci Objects
  RecursiveFibonacciComputation recursiveFibonacci = new RecursiveFibonacciComputation();
  IterativeFibonacciComputation iterativeFibonacci = new IterativeFibonacciComputation();
  RecursiveFibonacciHashMap recursiveFibonacciHashMap = new RecursiveFibonacciHashMap();

  // Factorial Objects
  RecursiveFactorialComputation recursiveFactorial = new RecursiveFactorialComputation();
  IterativeFactorialComputation iterativeFactorial = new IterativeFactorialComputation();

  /** Fibonacci & Recursive Fibonacci HashMap Test Cases.**/
  @Test
  public void testFibonacciZero() {
    assertEquals(recursiveFibonacci.compute(0), 0);
    assertEquals(iterativeFibonacci.compute(0), 0);
    assertEquals(recursiveFibonacciHashMap.compute(0), 0);
  }

  @Test
  public void testFibonacciOne() {
    assertEquals(recursiveFibonacci.compute(1), 1);
    assertEquals(iterativeFibonacci.compute(1), 1);
    assertEquals(recursiveFibonacciHashMap.compute(1), 1);
  }

  @Test
  public void testFibonacciTen() {
    assertEquals(recursiveFibonacci.compute(10), 55);
    assertEquals(iterativeFibonacci.compute(10), 55);
    assertEquals(recursiveFibonacciHashMap.compute(10), 55);
  }

  @Test
  public void testFibonacciFifteen() {
    assertEquals(recursiveFibonacci.compute(15), 610);
    assertEquals(iterativeFibonacci.compute(15), 610);
    assertEquals(recursiveFibonacciHashMap.compute(15), 610);
  }

  @Test
  public void testFibonacciTwenty() {
    assertEquals(recursiveFibonacci.compute(20), 6765);
    assertEquals(iterativeFibonacci.compute(20), 6765);
    assertEquals(recursiveFibonacciHashMap.compute(20), 6765);
  }

  /** Factorial Test Cases. **/
  @Test
  public void testFactorialZero() {
    assertEquals(recursiveFactorial.compute(0), 1);
    assertEquals(iterativeFactorial.compute(0), 1);
  }

  @Test
  public void testFactorialOne() {
    assertEquals(recursiveFactorial.compute(1), 1);
    assertEquals(iterativeFactorial.compute(1), 1);
  }

  @Test
  public void testFactorialFour() {
    assertEquals(recursiveFactorial.compute(4), 24);
    assertEquals(iterativeFactorial.compute(4), 24);
  }

  @Test
  public void testFactorialSix() {
    assertEquals(recursiveFactorial.compute(6), 720);
    assertEquals(iterativeFactorial.compute(6), 720);
  }
}
