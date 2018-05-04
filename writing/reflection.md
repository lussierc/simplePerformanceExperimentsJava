# Proposal by Team 3 (Lancaster Wu, Devin Ho, and Christian Lussier)

This lab required the team to explore the real-world application of computer
science and review content throughout the year. Every team member wrote their
own reflection of the experience.

## Lancaster's Reflection

I built all the computations, lists, ResultsTable, and experiment program. The
body part of project. I added the method `getNextInt` to check if user input is
an integer. The replay message to make the program can replay. Based on the
different times you run the program, you will get different opening output. The
first difficulty I faced  is in the `Experiment` and `RunCampaign`. The
different experiments requires different datatypes, so one method does not work
for all experiments. I created inheritance in RunCampaign for
ArithmeticComputation, and three different Lists. Then I spent long time try to
fix the error in the cancel feature by using the iteration go through the
ResultsTable which is an 2d array, and remove all the size 0 outputs. I somehow
failed with many different ways, and Christian later fixed it.

## Devin's Reflection

In our group project, I was in charge of implementing the test cases for
different computational methods as well as debugging. I had to add in the
`recursiveFibonacci`, `iterativeFibonacci`, and `recursiveFibonacciHashMap`
test cases. Additionally, I added in the test cases for `recursiveFactorial`
and `iterativeFactorial`. They allowed us to check for correctness in our code
which establishes a confidence in our coding as well. `Gradle` will then build
our program and display if the test cases passed or not. Afterwards, debugging
was a role in which I had to figure out why some implementations of our program
was not implemented correctly. This may be due to syntax or some other similar
error. Lastly, I was able to correct the indenting and spacing in our code in
order to promote clarity and visibility.

## Christian's Reflection

I implemented a variety of different things and faced a variety of challenges
while working on the project. I faced a challenge when implementing the cancel
function for the program, to make sure it does not run for an overly long
amount of time. I overcame this challenge by doing online research and speaking
with team members to find a solution. I also helped to implement code in the
computation folder and added computations that users can choose to run
performance evaluations on. I faced another challenge when I needed to
implement code to remove lines of the `ResultsTable` that outputted with values
of zero, caused by the cancel feature canceling the performance evaluation
before all of the rounds the user wanted to complete were done running. The
real challenge in implementing a fix for this issue was figuring out how to do
so. I originally, after speaking with Professor Kapfhammer, considered
implementing an iterative way of copying the two-dimensional array of the
ResultsTable, but struggled to do. Eventually, using deductive reasoning, I
determined that it would be easier to remove the parts of the string where the
incorrect values were being outputted. I implemented code in
`ResultsTable.java` in the `toString()` that removed all the incorrect lines
that started with zero and then removed all the empty lines created by this
fix. In addition to this, I also added detailed comments to the code and better
organized it in some cases. I also implemented some of the user input in
`Main.java` that allowed for greater user customization. Overall, though I
faced some challenges, the final project allowed me to better understand class
content covered throughout the year.
