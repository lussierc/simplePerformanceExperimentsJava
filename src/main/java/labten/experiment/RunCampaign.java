package labten.experiment;

import labten.computation.ArithmeticComputation;
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
}
