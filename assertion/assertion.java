Preconditions and postconditions are two types of assertions. Preconditions are assertions about a program’s state when a method is invoked, and postconditions are assertions about a program’s state after a method finishes



Java includes two versions of the assert statement for validating assertions programatically. 
The assert statement evaluates a boolean expression and determines whether it is true or false. 

The first form of the assert statement is 

	  assert expression; 

if the expression is false 


The second form is assert expression1 : expression2; 
if expression1 is false an AssertionError  is thrown with expression2 as the error message 

 
 By default, assertions are disabled when executing a program 
 because they reduce performance and are unnecessary for the program’s user.
 
 To enable assertions at runtime, use the -ea command-line option 
 when to the java command. 
 
 java -ea AssertTest


In order to run a program with asserts you must use the -ea command line parameter (i.e. java -ea AssertTest). 
