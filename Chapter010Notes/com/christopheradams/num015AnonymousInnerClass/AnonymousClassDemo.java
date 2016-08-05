package com.christopheradams.num015AnonymousInnerClass;

/**
   This program demonstrates an anonymous inner class
*/

import java.util.Scanner;

public class AnonymousClassDemo
{
   public static void main(String[] args)
   {
      int num;

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      /************** The Anonymous Inner Class ***********************/
      /* An Anonymous class must implement an interface or extend another class */
      /* If class extends a superclass the super class no-arg is called when instantiated */
      /* Anon class must override all abstract methods by interface it is implementing
       	 or the superclass it is extending */
      /* Anon class can access method it is defined in's variables but only if they are
      	 final or effectively final */
      /* We create a IntCalculator object named square that holds the reference to the object. */
      // Create an object that implements IntCalculator.
      /* Notice The Anonymous class IntCalculator() doesn't use word extends or implements
         it just uses the name of the class it is implementing or extending */
      IntCalculator square = new IntCalculator() {
         public int calculate(int number)
         {
            return number * number;
         }};
      /************** End The Anonymous Inner Class ***********************/

      // Get a number from the user.
      System.out.print("Enter an integer number: ");
      num = keyboard.nextInt();

      // Display the square of the number.
      System.out.println("The square is " + square.calculate(num));
   }
}