package labten.experiment;

import labten.computation.ArithmeticComputation;
import labten.data.ResultsTable;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Devin Ho, Christian Lussier, Lancaster Wu
 */

public interface Campaign {

  /** Require that any Campaign implementer can run an ArithmeticComputation in an experiment. */
  public ResultsTable run(ArithmeticComputation computation, int campaignLength);

}
