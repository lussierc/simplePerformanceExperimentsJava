package labten.experiment;

import labten.computation.IterativeFibonacciComputation;
import labten.computation.RecursiveFibonacciComputation;
import labten.computation.IterativeFactorialComputation;
import labten.computation.RecursiveFactorialComputation;
import labten.computation.RecursiveFibonacciHashMap;
import labten.data.ResultsTable;
import labten.list.ArrayList;
import labten.list.SinglyLinkedList;
import labten.list.DoublyLinkedList;
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

  private static final int TOSTRING_CAMPAIGN = 20;

  // Declarations of Colors
  public static String ANSI_RESET = "\u001B[0m";
  public static String ANSI_WHITE = "\u001B[37m";
  public static String ANSI_YELLOW = "\u001B[33m";

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
    System.out.println("Suggested campaign length: " + RECURSIVE_FIBONACCI_CAMPAIGN_LENGTH) + "\nWARNING!!!!!");
    System.out.println("The program may take VERY long to run if the caimpaign length is above 6.");
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

  public static void runRecursiveFibonacciHashMapExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFibonacciComputation and run it in a campaign
    System.out.println("Suggested campaign length: 14.\nWARNING!!!!!");
    System.out.println("A stack overflow" + ANSI_YELLOW + " WILL " + ANSI_RESET + "occur if the campaign length is greater than 14.");
    getInputLength();
    RecursiveFibonacciHashMap recursiveFibonaccihash = new RecursiveFibonacciHashMap();
    ResultsTable recursiveFibonacciHashResultsTable =
        runComputationCampaign.run(recursiveFibonaccihash, inputlength);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + recursiveFibonaccihash.getName() + ":\n");
    System.out.println(recursiveFibonacciHashResultsTable.toString());
    System.out.println();
  }

  /** Run the iterative experiment. */
  public static void runIterativeFibonacciExperiment() {
    // Add in the implementation of the iterative experiment
    RunCampaign runComputationCampaign = new RunCampaign();
    System.out.println("Suggested campaign length: " + ITERATIVE_FIBONACCI_CAMPAIGN_LENGTH);
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
    System.out.println("Suggested campaign length: " + RECURSIVE_FACTORIAL_CAMPAIGN_LENGTH);
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
    System.out.println("Suggested campaign length: " + ITERATIVE_FACTORIAL_CAMPAIGN_LENGTH);
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

  public static void runToStringSinglyLinkedListExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    System.out.println("Suggested campaign length: " + TOSTRING_CAMPAIGN);
    getInputLength();
    SinglyLinkedList<String> singlylinkedlist = new SinglyLinkedList<String>();
    ResultsTable toStringResultsTable =
        runComputationCampaign.run(singlylinkedlist, inputlength);
    // Add the source code to produce the summary output
    System.out.println();
    System.out.println("Results of an experiment campaign with toString");
    System.out.println(toStringResultsTable.toString());
    System.out.println();
  }

  public static void runToStringDoublyLinkedListExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    System.out.println("Suggested campaign length: " + TOSTRING_CAMPAIGN);
    getInputLength();
    DoublyLinkedList<String> doublylinkedlist = new DoublyLinkedList<String>();
    ResultsTable toStringResultsTable =
        runComputationCampaign.run(doublylinkedlist, inputlength);
    // Add the source code to produce the summary output
    System.out.println();
    System.out.println("Results of an experiment campaign with toString");
    System.out.println(toStringResultsTable.toString());
    System.out.println();
  }

  public static void runToStringArrayListExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    System.out.println("Suggested campaign length: " + TOSTRING_CAMPAIGN);
    getInputLength();
    ArrayList<String> arraylist = new ArrayList<String>();
    ResultsTable toStringResultsTable =
        runComputationCampaign.run(arraylist, inputlength);
    // Add the source code to produce the summary output
    System.out.println();
    System.out.println("Results of an experiment campaign with toString");
    System.out.println(toStringResultsTable.toString());
    System.out.println();
  }
}
