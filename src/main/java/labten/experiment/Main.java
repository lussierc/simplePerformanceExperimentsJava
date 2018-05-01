package labten.experiment;

import java.io.File;
import java.util.Scanner;

public class Main {

  // Declarations:
  public static int input = -1;
  public static Experiment exp = new Experiment();
  public static Boolean run = true;
  public static int times = 0;
  public static String asciiART1 = "LOADING...\n██████████████]99%\n";
  public static String ANSI_RESET = "\u001B[0m";
  public static String ANSI_WHITE = "\u001B[37m";

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

  /** Replay message that will be used when the program is finished running.
   * Allows the user to chose whether to rerun program or exit it.
   */
  public static void replayMessage () {
    System.out.println("Would you like to perform another experiment or exit the program?");
    System.out.println("Type 11 to restart the program."); // If user types in "6" the program is rerun
    System.out.println("Type 12 to end the program."); // If user types in "7" the program is exited.
    // Scans in user inputs:
    Scanner scanner = new Scanner(System.in);
    while(input < 11 || input > 12) {
      input = getNextInt(scanner);
      if(input < 11 || input > 12) {
        System.out.println("Your chosen number is not in the desired range.");
      }
    }
    if(input == 11){
      run = true;
      times++;
    } else {
      System.out.println("Thanks for using our program!");
      System.out.println("Have a great day!");
      System.exit(0);
    }
  }

  // Program's main method:
  public static void main(String[] args) throws Exception {
    while(run == true) {
      if (times == 0) {

      //pause...#1
      try {
        Thread.sleep(1);
      }
      catch (InterruptedException ex)
      {
        // do nothing
      }
      System.out.println(ANSI_WHITE + asciiART1 + ANSI_RESET);
      try {
        Thread.sleep(4000);
      }
      catch (InterruptedException ex)
      {
        // do nothing
      }

        System.out.println("Hi, this is RoboKapfhammer. I will assist you with completing performance evaluations of different computations and data types.\n");
        System.out.println("Please choose the types of computations:\n");
      } else if ( times > 0 && times < 3) {
        System.out.println("Hi again! This is RoboKapfhammer again! \n");
        System.out.println("Please choose the types of computations again:");
      } else if ( times > 2 && times < 6) {
        System.out.println("Hi, it seems like you really enjoy my assistance! You have continued using the program " + times + " now!\n");
        System.out.println("Please choose the type of computation:");
      } else if ( times == 100) {
        System.out.println("I am glad you are using the program so much!\n");
        System.out.println("The options are still the same:");
      } else if ( times == 112) {
        System.out.println("Hi, I'm glad you found the secrect round");
        System.out.println("This round we will not do an experiment!");
        replayMessage();
      } else {
        System.out.println("This is " + times + " how many time(s) you have run this program");
        System.out.println("Options:");
      }
      // Give the options for computations the user can use:
      System.out.println("Type 1 for IterativeFibonacciComputation Experiment.");
      System.out.println("Type 2 for RecursiveFibonacciComputation Experiment.");
      System.out.println("Type 3 for IterativeFactorialComputation Experiment.");
      System.out.println("Type 4 for RecursiveFactorialComputation Experiment.");
      System.out.println("Type 5 for RecursiveFibonacciComputation Experiment with the use of HashMap");
      System.out.println("Type 6 for SinglyLinkedList toString Experiment.");
      System.out.println("Type 7 for DoublyLinkedList toString Experiment.");
      System.out.println("Type 8 for ArrayList toString Experiment.");
      System.out.println("Type 9 for not running any experiment.");
      System.out.println("Type 0 to end the program.");
      System.out.println("\n" + ANSI_WHITE + "Please pick a computation experiment: " + ANSI_RESET);
      // Scan in the user inputs:
      Scanner scanner = new Scanner(System.in);
      while(input < 0 || input > 9) {
        input = getNextInt(scanner);
        if(input < 0 || input > 9 ) {
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
      } else if (input == 5) {
        Experiment.runRecursiveFibonacciHashMapExperiment();
        replayMessage();
      } else if (input == 6) {
        Experiment.runToStringSinglyLinkedListExperiment();
        replayMessage();
      } else if (input == 7) {
        Experiment.runToStringDoublyLinkedListExperiment();
        replayMessage();
      } else if (input == 8) {
        Experiment.runToStringArrayListExperiment();
        replayMessage();
      } else if (input == 9) {
        replayMessage ();
      } else if (input == 0) {
      System.out.println("Thank you very much for using our program!");
      System.out.println("You have used this program " + times + " time(s).");
      System.out.println("Have a great day!");
      System.exit(0);
      }
    }
  }
}
