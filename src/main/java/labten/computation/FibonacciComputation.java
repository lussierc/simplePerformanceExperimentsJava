package labten.computation;


public abstract class FibonacciComputation extends ArithmeticComputation {

  /** The default name of the class performing fibonacci computation. */
  private static final String DEFAULT_FIBONACCI_COMPUTER = "Fibonacci";

  /** Configure the name of the arithmetic computation. */
  public FibonacciComputation() {
    name = DEFAULT_FIBONACCI_COMPUTER;
  }

}
