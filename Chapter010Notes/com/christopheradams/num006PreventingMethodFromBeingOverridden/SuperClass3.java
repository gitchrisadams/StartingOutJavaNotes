package com.christopheradams.num006PreventingMethodFromBeingOverridden;

public class SuperClass3
{
   /**
      This method displays an int.
      @param arg An int.
   */
   // final keyword added to showValue() means it can't
   // be overridden by a subclass.
   public final void showValue(int arg)
   {
      System.out.println("SUPERCLASS: " +
            "The int argument was " + arg);
   }

   /**
      This method displays a String.
      @param arg A String.
   */
   // final keyword means a subclass cannot override this.
   public final void showValue(String arg)
   {
      System.out.println("SUPERCLASS: " +
         "The String argument was " + arg);
   }
}