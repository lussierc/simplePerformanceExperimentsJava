package labseven.computation;

/**
 * An abstract class for a FibonacciComputation.
 *
 * @author Gregory M. Kapfhammer
 */

public abstract class FibonacciComputation extends ArithmeticComputation {

  /** The default name of the class performing fibonacci computation. */
  private static final String DEFAULT_FIBONACCI_COMPUTER = "Fibonacci";

  /** Configure the name of the arithmetic computation. */
  public FibonacciComputation() {
    name = DEFAULT_FIBONACCI_COMPUTER;
  }

}
