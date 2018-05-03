package labten.computation;


public class IterativeFibonacciComputation extends FibonacciComputation {

  /** Configure the name of the arithmetic computation. */
  public IterativeFibonacciComputation() {
    // Gives the name of this computation
    name = "Iterative";
  }

  // int data type
  public long compute(int value) {
    long requestedFibonacciValue = 1;
    // Zero Case:
    // If value == 0 then fib(value) = 0.
    if (value == 0) {
      // Returns the correct value
      return 0;
    } else if (value <= 2) {
      // Base Case:
      // If value <= 2 then fib(value) = 1.
      // Return the correct value
      return 1;
    } else {
      /** "Recursive" Case: iteratively compute
      * Uses a loop to iteratively compute.
      */
      int fibonacci = 1;
      int prevFibonacci = 1;
      for (int looper = 2; looper < value; looper++) {
        int temp = fibonacci;
        fibonacci += prevFibonacci;
        prevFibonacci = temp;
      }
      return fibonacci;
    }
  }

  // long data type
  public long compute2(int value) {
    long requestedFibonacciValue = 1;
    // Zero Case:
    // If value == 0 then fib(value) = 0.
    if (value == 0) {
      // Returns the correct value
      return 0;
    } else if (value <= 2) {
      // Base Case:
      // If value <= 2 then fib(value) = 1.
      // Return the correct value
      return 1;
    } else {
      /** "Recursive" Case: iteratively compute
      * Uses a loop to iteratively compute.
      */
      long fibonacci = 1;
      long prevFibonacci = 1;
      for (long looper = 2; looper < value; looper++) {
        long temp = fibonacci;
        fibonacci += prevFibonacci;
        prevFibonacci = temp;
      }
      return fibonacci;
    }
  }

}
