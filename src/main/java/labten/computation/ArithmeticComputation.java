package labten.computation;


public abstract class ArithmeticComputation {

  /** The name of the class performing computation. */
  protected String name;

  /** The default name of the class performing computation. */
  private static final String DEFAULT_COMPUTER = "default";

  /** Configure the name of the arithmetic computation. */
  public ArithmeticComputation() {
    name = DEFAULT_COMPUTER;
  }

  /** The name of the arithmetic computation. */
  public String getName() {
    return name;
  }

  /** Require that an ArithmeticComputation provide a method for an int starting point. */
  public abstract long compute(int value);

}
