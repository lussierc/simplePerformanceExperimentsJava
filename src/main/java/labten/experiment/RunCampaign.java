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
    }
    System.out.println("... Finishing a campaign of experiments with " + compute.getName());
    return results;
  }

  public ResultsTable run(SinglyLinkedList<String> list, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("Starting a campaign of experiments with SinglyLinkedList ...");
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
    }
    System.out.println("... Finishing a campaign of experiments with SinglyLinkedList");
    return results;
  }

  public ResultsTable run(DoublyLinkedList<String> list, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("Starting a campaign of experiments with DoublyLinkedList ...");
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
    }
    System.out.println("... Finishing a campaign of experiments with DoublyLinkedList");
    return results;
  }

  public ResultsTable run(ArrayList<String> list, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("Starting a campaign of experiments with ArrayList...");
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
