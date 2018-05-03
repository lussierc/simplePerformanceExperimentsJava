# Proposal by Team 3 (Lancaster Wu, Devin Ho, and Christian Lussier)

This lab required me to explore the real-world applications of computer science.
Please review the Laboratory Assignment Sheet and add the required details to
this paragraph.

The second paragraph will discuss the first team member's insights.

The third paragraph will discuss the second team member's (Devin) insights. I
was responsible for adding the FibonacciRecursive computation into the program.
The user is asked to input numbers from 0 to 9 to either choose a type of
computation or to end the program. After that, the user is asked to input the
number of rounds they want the program to run. If the program takes too much
time to run the requested amount of rounds, the program will automatically stop
after 5 minutes. The output displays a results table with the size, timing, and
number ratio. The challenges included implementing the different terminal
colors and canceling feature.

Lancaster: I build all the computitions, lists, resultstable, and experiment
program. The body part of project. I added the method `getNextInt` to check if
user input is an interger. The replay message to make the program can replay.
Based on the different times you run the program, you will get different
openning output. The first difficulty I faced  is in the `Experiment` and
`RunCampaign`. The different experiments requires different datatypes, so one
method does not work for all experiments. I created inheritance in RunCampaign
for ArithmeticComputation, and three different Lists. Then I spent long time
try to fix the error in the cancle feature by using the iteration go through
the resultstable which is an 2d array, and remove all the size 0 outputs. I
somehow failed with many different ways, and Christian later fixed it. 
