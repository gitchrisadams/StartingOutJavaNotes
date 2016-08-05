package com.christopheradams.num017LambdaExpressionsWithFuncInterfaces;

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
      int num;

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      /********** This is a lambda expression ************/
      // Create an object that implements IntCalculator.
      // The variable name square is used to reference the object.
      /* The general format of lambda is paramater -> expression
      	 x on the left side of the -> is the parameter variable we are passing in.
      	 The expression x * x on the right of the -> is the value that is returned. */
      /* So this overrides the abstract method of the calculate() in IntCalculator.
         this lambda now makes it so it multiplies x * x and returns it. The original
         method in calculate is abstract and does not do that */
      IntCalculator square = x -> x * x;

      /********** End Lambda expression *******************/

      // Get a number from the user.
      System.out.print("Enter an integer number: ");
      num = keyboard.nextInt();

      // Display the square of the number.
      System.out.println("The square is " + square.calculate(num));
   }
}
