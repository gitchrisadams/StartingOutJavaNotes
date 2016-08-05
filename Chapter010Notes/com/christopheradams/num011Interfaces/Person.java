package com.christopheradams.num011Interfaces;

// Notice it implements Displayable.
// This means the Person class must have the
// methods defined in the Displayable.java file,
// in this case only one method, the display() method.
public class Person implements Displayable
{
   private String name;

   // Constructor
   public Person(String n)
   {
      name = n;
   }

   // display method
   public void display()
   {
      System.out.println("My name is " + name);
   }
}
