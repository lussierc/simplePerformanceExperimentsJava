package labten.experiment;

import labten.computation.ArithmeticComputation;
import labten.list.ArrayList;
import labten.list.DoublyLinkedList;
import labten.list.SinglyLinkedList;
import labten.data.ResultsTable;

import java.util.Random;
import java.util.Scanner;

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 1;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  public static int datatype;

  public static int input = -1;

  // Declarations of Colors
  public static String ANSI_RESET = "\u001B[0m";
  public static String ANSI_WHITE = "\u001B[37m";
  public static String ANSI_YELLOW = "\u001B[33m";

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

  /** Run a provided ArithmeticComputation in an experiment campaign for specified rounds. */
  public ResultsTable run(ArithmeticComputation compute, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("What kind of data type do you want to test?");
    System.out.println("type 13 for int experiment.");
    System.out.println("type 14 for long experiment.");
    Scanner scanner = new Scanner(System.in);
    while(input < 13 || input > 14) {
      input = getNextInt(scanner);
      if(input < 13 || input > 14) {
        System.out.println("Your chosen number is not in the desired range.");
      }
    }
    System.out.println("Starting a campaign of experiments with " + compute.getName() + " ...");
    long start = System.currentTimeMillis();
    while (campaignRound < campaignLength) {
      long timeBefore = System.currentTimeMillis();
      if (input == 1) {
        compute.compute(currentInputSize);
      } else {
        compute.compute2(currentInputSize);
      }
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
      long end = start + 300000L; //The end time which is 180000ms or 3 minutse
      // The performance evaluation will run until the end time (3 minutes) is reached and until the campaign round currently running is completed.
      if (System.currentTimeMillis() > end) {
         System.out.println("The computational method has run for more than 5 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
         break; //Exits the loop
    }
  }
  System.out.println("... Finishing a campaign of experiments with " + compute.getName());
  input = 0;
  return results;
}

  public ResultsTable run(SinglyLinkedList<String> list, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("Starting a campaign of experiments with SinglyLinkedList ...");
    long start = System.currentTimeMillis();
    while (campaignRound < campaignLength) {
      long timeBefore = System.currentTimeMillis();
      populateList(list, currentInputSize);
      list.toString();
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
      long end = start + 300000L; //The end time which is 180000ms or 3 minutse
      // The performance evaluation will run until the end time (3 minutes) is reached and until the campaign round currently running is completed.
      if (System.currentTimeMillis() > end) {
         System.out.println("The computational method has run for more than 5 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
         break; //Exits the loop
    }
  }
  System.out.println("... Finishing a campaign of experiments with DoublyLinkedList");
  return results;
}

  public ResultsTable run(DoublyLinkedList<String> list, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("Starting a campaign of experiments with DoublyLinkedList ...");
    long start = System.currentTimeMillis();
    while (campaignRound < campaignLength) {
      long timeBefore = System.currentTimeMillis();
      populateList(list, currentInputSize);
      list.toString();
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
      long end = start + 300000L; //The end time which is 180000ms or 3 minutse
      // The performance evaluation will run until the end time (3 minutes) is reached and until the campaign round currently running is completed.
      if (System.currentTimeMillis() > end) {
         System.out.println("The computational method has run for more than 5 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
         break; //Exits the loop
    }
  }
  System.out.println("... Finishing a campaign of experiments with DoublyLinkedList");
  return results;
}

  public ResultsTable run(ArrayList<String> list, int campaignLength) {
    ResultsTable results = new ResultsTable(campaignLength);
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    System.out.println("Starting a campaign of experiments with ArrayList...");
    long start = System.currentTimeMillis();
    while (campaignRound < campaignLength) {
      long timeBefore = System.currentTimeMillis();
      populateList(list, currentInputSize);
      list.toString();
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
      long end = start + 300000L; //The end time which is 180000ms or 3 minutse
      // The performance evaluation will run until the end time (3 minutes) is reached and until the campaign round currently running is completed.
      if (System.currentTimeMillis() > end) {
        System.out.println("The computational method has run for more than 5 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
        break; //Exits the loop
      }
    }
    System.out.println("... Finishing a campaign of experiments with ArrayList");
    return results;
  }

  public void populateList(SinglyLinkedList<String> list, int requestedSize) {
    // Use a loop to fill a SinglyLinkedList with requestedSize elements
    for (int i = 0; i < requestedSize; i++) {
      list.addLast(Integer.toString(i));
    }
  }

  public void populateList(DoublyLinkedList<String> list, int requestedSize) {
    // Use a loop to fill a SinglyLinkedList with requestedSize elements
    for (int i = 0; i < requestedSize; i++) {
      list.addLast(Integer.toString(i));
    }
  }

  public void populateList(ArrayList<String> list, int requestedSize) {
    // Use a loop to fill a SinglyLinkedList with requestedSize elements
    for (int i = 0; i < requestedSize; i++) {
      list.add(i, Integer.toString(i));
    }
  }
}
