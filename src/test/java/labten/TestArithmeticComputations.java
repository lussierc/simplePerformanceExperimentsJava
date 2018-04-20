package labten;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labten.computation.IterativeFibonacciComputation;
import labten.computation.RecursiveFibonacciComputation;
import org.junit.Test;

import java.util.Arrays;



public class TestArithmeticComputations {

  /** Create the two objects used in all of the test suites. */
  RecursiveFibonacciComputation recursiveFibonacci = new RecursiveFibonacciComputation();
  IterativeFibonacciComputation iterativeFibonacci = new IterativeFibonacciComputation();

  @Test
  public void testFibonacciZero() {
    assertEquals(recursiveFibonacci.compute(0), 0);
    assertEquals(iterativeFibonacci.compute(0), 0);
  }

  @Test
  public void testFibonacciOne() {
    assertEquals(recursiveFibonacci.compute(1), 1);
    assertEquals(iterativeFibonacci.compute(1), 1);
  }

  @Test
  public void testFibonacciTen() {
    assertEquals(recursiveFibonacci.compute(10), 55);
    assertEquals(iterativeFibonacci.compute(10), 55);
  }

  @Test
  public void testFibonacciFifteen() {
    assertEquals(recursiveFibonacci.compute(15), 610);
    assertEquals(iterativeFibonacci.compute(15), 610);
  }

  @Test
  public void testFibonacciTwenty() {
    assertEquals(recursiveFibonacci.compute(20), 6765);
    assertEquals(iterativeFibonacci.compute(20), 6765);
  }

}
