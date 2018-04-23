package labten.experiment;

import java.io.File;
import java.util.Scanner;

public class Main {

  // Declarations:
  public static int input = -1;
  public static Experiment exp = new Experiment();
  public static Boolean run = true;

  public static int getNextInt(Scanner scanner) {
    int input = -1;
    int loop = 0;
    while (loop == 0) {
      if(scanner.hasNext()) {
        if (scanner.hasNextInt()) {
          input = scanner.nextInt();
          scanner.nextLine();
          return input;
        }
        else{
          System.out.println("Please enter an integer.");
          scanner.nextLine();
        }
      }
    }
    return input;
  }

  public static void replayMessage () {
    System.out.println("Do you want to see another experiment or end the program?");
    System.out.println("Type 5 for restart the program.");
    System.out.println("Type 6 for end the program.");
    //input a main menu option when we have another program
    Scanner scanner = new Scanner(System.in);
    while(input < 5 || input > 6) {
      input = getNextInt(scanner);
      if(input < 5 || input > 6) {
        System.out.println("Your number is not in the desired range.");
      }
    }
    if(input == 5){
      run = true;
    } else {
      System.out.println("Thanks very much for using our program!");
      System.out.println("Have a good day!");
      System.exit(0);
    }
  }

  //  main method
  public static void main(String[] args) throws Exception {
    while(run == true) {
      //  greeting massage
      System.out.println("Hi, this is RoboKapfhammer. I will assist you with completing performance evaluations of different computations and data types.");
      System.out.println("");
      System.out.println("Types of computations:");
      //  give the opptions
      System.out.println("Type 1 for IterativeFibonacciComputation Experiment.");
      System.out.println("Type 2 for ResursiveFibonacciComputation Experiment.");
      System.out.println("Type 3 for IterativeFactorialComputation Experiment.");
      System.out.println("Type 4 for ResursiveFactorialComputation Experiment.");
      System.out.println("Type 0 to end the program.");
      System.out.println("Please pick a computation experiment: ");
      //  scan inputs and lead the players to different games
      Scanner scanner = new Scanner(System.in);
      while(input < 0 || input > 4) {
        input = getNextInt(scanner);
        if(input < 0 || input > 4) {
          System.out.println("Your number is not in the desired range.");
        }
      }
      /** Run the experiment campaigns for a different number of rounds. */
      if(input == 1) {
      Experiment.runIterativeFibonacciExperiment();
      replayMessage ();
      } else if (input == 2) {
      Experiment.runRecursiveFibonacciExperiment();
      replayMessage ();
      } else if (input == 3) {
      Experiment.runRecursiveFactorialExperiment();
      replayMessage ();
      } else if (input == 4) {
      Experiment.runRecursiveFactorialExperiment();
      replayMessage ();
      } else if (input == 0) {
        System.out.println("Thank you very much for using our program!");
        System.out.println("Have a good day!");
        System.exit(0);
      }
    }
  }
}
