package labten.computation;

import java.util.HashMap;


public class RecursiveFibonacciHashMap extends FibonacciComputation {
  private HashMap<Integer, Integer> map;

  /** Configure the name of the arithmetic computation. */
  public RecursiveFibonacciHashMap() {
    // Give the name of this computation
    name = "RecursiveFibonacciComputationHashMap";
    map = new HashMap<>();
  }

  /**
   * Recursively calculate the valueth Fibonacci number using longs.
   *
   * @param value indicates which Fibonacci number to compute.
   * @return the valueth Fibonacci number.
   */
  public long compute(int value) {
    // Zero Case:
    // If value == 0 then fib(value) = 0.
    if (value == 0) {
      // return a value
      return value;
    } else if (value < 2) {
      // Base Case:
      // If value <= 2 then fib(value) = 1.
      // return a value
      return 1;
    } else if (map.containsKey(value)) {
      return map.get(value);
    } else {
      // Recursive Case:
      // Otherwise, return fib(value-1) + fib(value-2)
      // recursively call the method and return value
      long fibonacciValue = compute(value - 2) + compute(value - 1);
      map.put(value, (int)fibonacciValue);
      return fibonacciValue;
    }
  }

}
