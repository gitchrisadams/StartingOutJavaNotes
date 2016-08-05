package com.christopheradams.num013DefaultMethodsInInterfaces;

public interface Displayable
{
   // This is a default method for the interface.
   // This means it has a body unlike normal methods
   // in an interface.
   // Notice the keyword default, this is required for a default method.
   // A class that implements this can override this default
   // method but does not have to.
   default void display()
   {
      System.out.println("This is the default display method.");
   }
}