package labten.computation;

/**
 * An abstract class for a FactorialComputation.
 */

public abstract class FactorialComputation extends ArithmeticComputation {

  /** The default name of the class performing fibonacci computation. */
  private static final String DEFAULT_FACTORIAL_COMPUTER = "Factorial";

  /** Configure the name of the arithmetic computation. */
  public FactorialComputation() {
    name = DEFAULT_FACTORIAL_COMPUTER;
  }

}
