package com.christopheradams.num002SuperClassConstructor;

public class SubClass2 extends SuperClass2
{
   /**
      Constructor
   */

   public SubClass2()
   {
	   // When a new SubClass is created, this constructor calls the
	   // super class which is named SuperClass2 and passed in the value 10.
	   // NOTE: You can only call the super from the subclass's constructor and
	   // it must be the first statement in the constructor.
      super(10);

      // Output message to show we are in the subclass.
      System.out.println("This is the " +
                 "subclass constructor.");
   }
}