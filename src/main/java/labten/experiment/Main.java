package labten.experiment;

import java.io.File;
import java.util.Scanner;

public class Main {

  // Declarations:
  public static int input = -1;
  public static Experiment exp = new Experiment();
  public static Boolean run = true;
  public static int times = 0;

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
    System.out.println("Would you want to see another experiment or end the program?");
    System.out.println("Type 6 to restart the program.");
    System.out.println("Type 7 to end the program.");
    //input a main menu option when we have another program
    Scanner scanner = new Scanner(System.in);
    while(input < 6 || input > 7) {
      input = getNextInt(scanner);
      if(input < 6 || input > 7) {
        System.out.println("Your number is not in the desired range.");
      }
    }
    if(input == 6){
      run = true;
      times++;
    } else {
      System.out.println("Thanks for using our program!");
      System.out.println("Have a great day!");
      System.exit(0);
    }
  }

  //  main method
  public static void main(String[] args) throws Exception {
    while(run == true) {
      //  greeting massage
      if (times == 0) {
        System.out.println("Hi, this is RoboKapfhammer. I will assist you with completing performance evaluations of different computations and data types.");
        System.out.println("");
        System.out.println("Please choose the types of computations:");
      } else if ( times > 0 && times < 3) {
        System.out.println("Hi again! This is RoboKapfhammer again! ");
        System.out.println("");
        System.out.println("Please choose the types of computations again:");
      } else if ( times > 2 && times < 6) {
        System.out.println("Hi, it seems like you really enjoy my assistance! This is " + times + " times you run this program!");
        System.out.println("");
        System.out.println("Please choose the types of computations:");
      } else if ( times == 100) {
        System.out.println("I am glad you are up for a challenge!");
        System.out.println("");
        System.out.println("The options are still the same:");
      } else if ( times == 112) {
        System.out.println("Hi, I'm glad you found the secrect round");
        System.out.println("This round we will not do an experiment!");
        replayMessage();
      } else {
        System.out.println("This is " + times + " how many time(s) you have run this program");
        System.out.println("Options:");
      }
      //  give the opptions
      System.out.println("Type 1 for IterativeFibonacciComputation Experiment.");
      System.out.println("Type 2 for ResursiveFibonacciComputation Experiment.");
      System.out.println("Type 3 for IterativeFactorialComputation Experiment.");
      System.out.println("Type 4 for ResursiveFactorialComputation Experiment.");
      System.out.println("Type 5 for not running any Experiment.");
      System.out.println("Type 0 to end the program.");
      System.out.println("Please pick a computation experiment: ");
      //  scan inputs and lead the players to different games
      Scanner scanner = new Scanner(System.in);
      while(input < 0 || input > 5) {
        input = getNextInt(scanner);
        if(input < 0 || input > 5) {
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
      } else if (input == 5){
      replayMessage();
      } else if (input == 0) {
        System.out.println("Thank you very much for using our program!");
        System.out.println("You have used this program " + times + " time(s).");
        System.out.println("Have a great day!");
        System.exit(0);
      }
    }
  }
}
