package labten.experiment;

import labten.computation.ArithmeticComputation;
import labten.list.ArrayList;
import labten.list.DoublyLinkedList;
import labten.list.SinglyLinkedList;
import labten.data.ResultsTable;

import java.util.Random;

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 1;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";


  /** Run a provided ArithmeticComputation in an experiment campaign for specified rounds. */
  public ResultsTable run(ArithmeticComputation compute, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("Starting a campaign of experiments with " + compute.getName() + " ...");
    long start = System.currentTimeMillis();
    while (campaignRound < campaignLength) {
      long timeBefore = System.currentTimeMillis();
      compute.compute(currentInputSize);
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
         System.out.println("The computational method has run for more than 3 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
         break; //Exits the loop
    }
  }
  System.out.println("... Finishing a campaign of experiments with " + compute.getName());
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
         System.out.println("The computational method has run for more than 3 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
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
         System.out.println("The computational method has run for more than 3 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
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
        System.out.println("The computational method has run for more than 3 minutes. Exiting...."); // Tells the user that the computational method has run for over 3 minutes and will now exit.
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
