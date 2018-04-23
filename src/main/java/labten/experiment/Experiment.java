package labten.experiment;

import labten.computation.IterativeFibonacciComputation;
import labten.computation.RecursiveFibonacciComputation;
import labten.data.ResultsTable;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds depending on the strategy.
 *
 * @author Devin Ho, Christian Lussier, Lancaster Wu
 */

public class Experiment {

  /** The campaign length for the RecursiveFibonacciComputation. */
  private static final int RECURSIVE_FIBONACCI_CAMPAIGN_LENGTH = 6;

  /** The campaign length for the IterativeFibonacciComputation. */
  private static final int ITERATIVE_FIBONACCI_CAMPAIGN_LENGTH = 23;

  /** Run the recursive experiment. */
  public static void runRecursiveExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFibonacciComputation and run it in a campaign
    RecursiveFibonacciComputation recursiveFibonacci = new RecursiveFibonacciComputation();
    ResultsTable recursiveFibonacciResultsTable =
        runComputationCampaign.run(recursiveFibonacci, RECURSIVE_FIBONACCI_CAMPAIGN_LENGTH);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + recursiveFibonacci.getName() + ":\n");
    System.out.println(recursiveFibonacciResultsTable.toString());
    System.out.println();
  }

  /** Run the iterative experiment. */
  public static void runIterativeExperiment() {
    // TODO: Add in the implementation of the iterative experiment
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFibonacciComputation and run it in a campaign
    IterativeFibonacciComputation iterativeFibonacci = new IterativeFibonacciComputation();
    ResultsTable iterativeFibonacciResultsTable =
        runComputationCampaign.run(iterativeFibonacci, ITERATIVE_FIBONACCI_CAMPAIGN_LENGTH);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + iterativeFibonacci.getName() + ":\n");
    System.out.println(iterativeFibonacciResultsTable.toString());
    System.out.println();
  }



}
