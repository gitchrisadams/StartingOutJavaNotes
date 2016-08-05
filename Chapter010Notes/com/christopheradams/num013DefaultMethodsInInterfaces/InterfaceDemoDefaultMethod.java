package com.christopheradams.num013DefaultMethodsInInterfaces;

/**
   This program demonstrates a class that implements
   the Displayable interface (with a default method).
*/

public class InterfaceDemoDefaultMethod
{
   public static void main(String[] args)
   {
      // Create an instance of the Person class.
      Person p = new Person("Antonio");

      // Call the object's display method.
      // This is calling the default method in the Displayable interface.
      p.display();
   }
}