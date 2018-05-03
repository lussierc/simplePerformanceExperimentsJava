package labten.computation;

public class RecursiveFactorialComputation extends FactorialComputation {

  /** Configure the name of the arithmetic computation. */
  public RecursiveFactorialComputation() {
    // Gives the name of this computation, in this case "Recursive"
    name = "Recursive";
  }

  /** Recursively calculates the valueth Factorial number to compute. */

  // int data type
  public long compute(int value) {
    if (value <= 1) {
      return 1;
    } else {
      return value * compute(value - 1);
    }
  }

  // long data type
  public long compute2(int value) {
    if (value <= 1) {
      return 1;
    } else {
      return value * compute2(value - 1);
    }
  }
}
