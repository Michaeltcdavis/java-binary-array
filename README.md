# CountIntInArray

This function takes an array whose entries can only be either zero or an integer, and returns the integer value and the number of times the integer is repeated.

I improved the performance of the program by breaking the loop when I find the value of the non zero integer and continuing with a second loop which only needs to increase the count.

I improved the return of the helper function by returning a result class which holds the two result values together in a descriptive way for readability.

## Running the Script

1. Enter the array to be processed in the main function of CountIntInArray.java
2. Make sure JDK is installed on your computer
3. compile the program into a .class file with ```javac CountIntInArray.java``` in the file's directory on the command line 
4. Run the program with ```java CountIntInArray``` on the command line and look at the output

## References

https://introcs.cs.princeton.edu/java/home/