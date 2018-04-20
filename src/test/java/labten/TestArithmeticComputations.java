package labten;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labseven.computation.IterativeFibonacciComputation;
import labseven.computation.RecursiveFibonacciComputation;
import org.junit.Test;

import java.util.Arrays;

/**
 * A JUnit test suite for the different ArithmeticComputation implementations.
 *
 * <p>Please refer to this web site for the computed values:
 * http://planetmath.org/listoffibonaccinumbers
 *
 * <p>Please note that the computational cost of a certain algorithm
 * prevents the efficient testing of input values. For instance, running
 * this test suite with a new test calling compute(32) could take a long time!
 *
 * @author Gregory M. Kapfhammer
 */

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
