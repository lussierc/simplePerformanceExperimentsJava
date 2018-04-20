package labten.computation;

/**
 * IterativeFibonacci -
 *   A recursive program for computing the valueth
 *   Fibonacci number. The Fibonacci numbers
 *   are generated by starting with the numbers
 *   1 and 1, and then successively adding
 *   the two previous numbers in the sequence.
 *
 *   <p>1, 1, 2, 3, 5, 8, 13, 21, ...
 *
 *   <p>A recursive definition of the Fibonacci
 *   sequence is:
 *
 *   <p>fib(n) = 1                   if n <= 2
 *             = fib(n-1) + fib(n-2) if n < 2.
 *
 * @author Grant William Braught
 * @author Gregory M. Kapfhamer
 */
public class IterativeFibonacciComputation extends FibonacciComputation {

  /** Configure the name of the arithmetic computation. */
  public IterativeFibonacciComputation() {
    // Gives the name of this computation
    name = "Iterative";
  }

  /**
   * Iteratively calculate the valueth Fibonacci number using longs.
   *
   * @param value indicates which Fibonacci number to compute.
   * @return the valueth Fibonacci number.
   */
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
      * Code for loop inspire by https://gist.github.com/meghakrishnamurthy/331bd9addab3dbb1b6a23802b1c6845e
      * Code also inspired by the book.
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

}
