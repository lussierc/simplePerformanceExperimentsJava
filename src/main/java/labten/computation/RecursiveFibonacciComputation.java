package labten.computation;


public class RecursiveFibonacciComputation extends FibonacciComputation {

  /** Configure the name of the arithmetic computation. */
  public RecursiveFibonacciComputation() {
    // Gives the name of this computation, in this case "Recursive"
    name = "Recursive";
  }

  /**
   * Recursively calculate the valueth Fibonacci number using longs.
   *
   * @param value indicates which Fibonacci number to compute.
   * @return the valueth Fibonacci number.
   */

  // int data type
  public long compute(int value) {
    // Zero Case:
    // If value == 0 then fib(value) = 0.
    if (value == 0) {
      // Returns a value
      return 0;
    } else if (value <= 2) {
      // Base Case:
      // If value <= 2 then fib(value) = 1.
      // Returns a value
      return 1;
    } else {
      // Recursive Case:
      // Otherwise, return fib(value-1) + fib(value-2)
      // Recursively calls the method and return value
      return compute(value - 2) + compute(value - 1);
    }
  }

  // long data type
  public long compute3(long value) {
    // Zero Case:
    // If value == 0 then fib(value) = 0.
    if (value == 0) {
      // Returns a value
      return 0;
    } else if (value <= 2) {
      // Base Case:
      // If value <= 2 then fib(value) = 1.
      // Returns a value
      return 1;
    } else {
      // Recursive Case:
      // Otherwise, return fib(value-1) + fib(value-2)
      // Recursively calls the method and return value
      return compute3(value - 2) + compute3(value - 1);
    }
  }

}
