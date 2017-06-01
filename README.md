# MarsRover
This program was written in Java SE8 using NetBeans 8.2.
It may be run from the command line by running the class MainHQ with the input file name and extension as the argument. The file Commands.txt has been included with the sample input from the specification.
Alternatively, the program will run from NetBeans by choosing to Run the MarsRover Project. The Main Class and Arguments have been set up. Use Project Properties to check this.

My TDD skills are very rusty, so Tests did not drive this solution. I attempted to separate the Rover object from the Zone, but too much Zone code ended up in Rover, which needs to be refactored, time willing. The aim was working solution while being pressed for time, however comments interspersed demonstrate my thought process. I did not allow the Rover to move along a Path that exists outside the Zone. The Rover will not move until the next allowable portion of instructions is processed. The program can accept multiple Zone and Rover Path scenarios. Ensure that the file ends at the last line containing input (code for trimming file could be added later/different input parsing method).
