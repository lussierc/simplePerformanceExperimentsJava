package labten.experiment;

import labten.computation.IterativeFibonacciComputation;
import labten.computation.RecursiveFibonacciComputation;
import labten.computation.IterativeFactorialComputation;
import labten.computation.RecursiveFactorialComputation;
import labten.data.ResultsTable;
import java.util.Scanner;

public class Experiment {

  /** The campaign length for the RecursiveFibonacciComputation. */
  public static int inputlength;

  private static final int RECURSIVE_FIBONACCI_CAMPAIGN_LENGTH = 6;

  /** The campaign length for the IterativeFibonacciComputation. */
  private static final int ITERATIVE_FIBONACCI_CAMPAIGN_LENGTH = 23;

  /** The campaign length for the RecursiveFactorialComputation. */
  private static final int RECURSIVE_FACTORIAL_CAMPAIGN_LENGTH = 13;

  /** The campaign length for the IterativeFactorialComputation. */
  private static final int ITERATIVE_FACTORIAL_CAMPAIGN_LENGTH = 13;

  /** Run the recursive experiment. */
  public static int getNextInt(Scanner scan) {
    int input = -1;
    int loop = 0;
    while (loop == 0) {
      if(scan.hasNext()) {
        if (scan.hasNextInt()) {
          input = scan.nextInt();
          scan.nextLine();
          return input;
        }
        else{
          System.out.println("Please enter an integer.");
          scan.nextLine();
        }
      }
    }
    return input;
  }

  public static void getInputLength() {
    System.out.println("Please type in the input campaign length:");
    Scanner scan = new Scanner(System.in);
    inputlength = getNextInt(scan);
  }

  public static void runRecursiveFibonacciExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFibonacciComputation and run it in a campaign
    System.out.println("Suggested caimpaign length: " + RECURSIVE_FIBONACCI_CAMPAIGN_LENGTH);
    getInputLength();
    RecursiveFibonacciComputation recursiveFibonacci = new RecursiveFibonacciComputation();
    ResultsTable recursiveFibonacciResultsTable =
        runComputationCampaign.run(recursiveFibonacci, inputlength);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + recursiveFibonacci.getName() + ":\n");
    System.out.println(recursiveFibonacciResultsTable.toString());
    System.out.println();
  }

  /** Run the iterative experiment. */
  public static void runIterativeFibonacciExperiment() {
    // Add in the implementation of the iterative experiment
    RunCampaign runComputationCampaign = new RunCampaign();
    System.out.println("Suggested caimpaign length: " + ITERATIVE_FIBONACCI_CAMPAIGN_LENGTH);
    getInputLength();
    // Create a RecursiveFibonacciComputation and run it in a campaign
    IterativeFibonacciComputation iterativeFibonacci = new IterativeFibonacciComputation();
    ResultsTable iterativeFibonacciResultsTable =
        runComputationCampaign.run(iterativeFibonacci, inputlength);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + iterativeFibonacci.getName() + ":\n");
    System.out.println(iterativeFibonacciResultsTable.toString());
    System.out.println();
  }

  /** Run the recursive experiment. */
  public static void runRecursiveFactorialExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    System.out.println("Suggested caimpaign length: " + RECURSIVE_FACTORIAL_CAMPAIGN_LENGTH);
    getInputLength();
    // Create a RecursiveFactorialComputation and run it in a campaign
    RecursiveFactorialComputation recursiveFactorial = new RecursiveFactorialComputation();
    ResultsTable recursiveFactorialResultsTable =
        runComputationCampaign.run(recursiveFactorial, inputlength);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + recursiveFactorial.getName() + ":\n");
    System.out.println(recursiveFactorialResultsTable.toString());
    System.out.println();
  }

  /** Run the iterative experiment. */
  public static void runIterativeFactorialExperiment() {
    // Add in the implementation of the iterative experiment
    RunCampaign runComputationCampaign = new RunCampaign();
    System.out.println("Suggested caimpaign length: " + ITERATIVE_FACTORIAL_CAMPAIGN_LENGTH);
    getInputLength();
    IterativeFactorialComputation iterativeFactorial = new IterativeFactorialComputation();
    ResultsTable iterativeFactorialResultsTable =
        runComputationCampaign.run(iterativeFactorial, inputlength);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                        + iterativeFactorialResultsTable.toString());
    System.out.println(iterativeFactorialResultsTable.toString());
    System.out.println();
  }

}
