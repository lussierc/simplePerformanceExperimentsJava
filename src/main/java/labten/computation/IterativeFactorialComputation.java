package labten.computation;

public class IterativeFactorialComputation extends FactorialComputation {

  /** Configure the name of the arithmetic computation. */
  public IterativeFactorialComputation() {
    // Gives the name of this computation
    name = "Iterative";
  }

  /** Iteratively calculates the valueth Factorial number to compute. */
  public long compute(int value) {
    if (value <= 1) {
      return 1;
    } else {
      int iterative = 1;
      int previousnumber = 1;
      for (int i = 2; i < value + 1; i++) {
        iterative = iterative * i;
      }
      return iterative;
    }
  }
}
