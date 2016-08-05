package com.christopheradams.num018LambdaExpressionsMoreExamples;

/**
   This program demonstrates a simple
   lambda expression.
*/

import java.util.Scanner;
// Notice we do not need the implements IntCalculator like we normally would.
// We are using a Lambda so do not need to implement IntCalculator.
public class LambdaDemo
{
   public static void main(String[] args)
   {
      int num1;
      int num2;

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      /********** This is a lambda expression 1 ************/
      // Create an object that implements IntCalculator.
      // The variable name square is used to reference the object.
      /* The general format of lambda is paramater -> expression
      	 x on the left side of the -> is the parameter variable we are passing in.
      	 The expression x * x on the right of the -> is the value that is returned. */
      /* So this overrides the abstract method of the calculate() in IntCalculator.
         this lambda now makes it so it multiplies x * x and returns it. The original
         method in calculate is abstract and does not do that */
      IntCalculator square = x -> x * x;

      /********** End Lambda expression 1 *******************/

	  /* Uncomment this and matching statement in interface to */
	  /* demonstrate a lambda with a void return type. */
      //IntCalculator square2 = x -> System.out.println(x);

	  /* Uncomment this and matching statement in interface to */
	  /* demonstrate a lambda with multiple parameters */
      //IntCalculator square2 = (x,y) -> x + y;

 	  /* Uncomment this and matching statement in interface to */
 	  /* demonstrate a lambda that has no parameters */
 	  // This prints out a blank line using a lambda.
      //IntCalculator square2 = () -> System.out.println();;

      /* YOu can also specify a parameters type even though it is optional
         and you don't have to (compiler figures it out on its own). */
         // Like this:
         // IntCalculator square = (int x) -> x * x;

      /* Using multiple statements in the body of a Lambda expression */
      IntCalculator square3 = (int x) ->
      {
		  // More statements here if you want.
		  // When doing this you must use the return statement.
		  return x * x;
	  };


      // Get a numbers from the user.
      System.out.print("Enter an integer number: ");
      num1 = keyboard.nextInt();
      System.out.print("Enter an integer number: ");
      num2 = keyboard.nextInt();


      // Uncomment his to Display two numbers added together using a lambda.
      //System.out.println("The square is " + square2.calculate(num1, num2));

	  // Display a number squared using a lambda.
      System.out.println("The square is " + square.calculate(num1));

   }
}
