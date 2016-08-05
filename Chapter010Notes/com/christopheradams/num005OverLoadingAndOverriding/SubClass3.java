package com.christopheradams.num005OverLoadingAndOverriding;

// Notice it extends the SuperClass3 or "inherits from it".
public class SubClass3 extends SuperClass3
{
   /**
      This method overrides one of the superclass methods.
      @param arg An int.
   */
	// This has the same signature as showValue in SuperClass3 so
	// it is overridden.
   @Override
   public void showValue(int arg)
   {
      System.out.println("SUBCLASS: " +
            "The int argument was " + arg);
   }

   /**
      This method overloads the superclass methods.
      @param arg A double.
   */
	// The super class doesn't have a method with the signature
	// (double arg) so this method is overloaded.
   public void showValue(double arg)
   {
      System.out.println("SUBCLASS: " +
            "The double argument was " + arg);
   }
}