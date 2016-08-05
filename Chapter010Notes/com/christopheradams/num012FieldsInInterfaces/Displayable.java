package com.christopheradams.num012FieldsInInterfaces;

// This is the interface.
// The methods listed her must be used
// in classes that implement Displayable.
public interface Displayable
{
   // Example of Fields in an Interface.
   // Both these files are considered final static.
   // Any class that implements the Displayable interface will
   // have access to these field.
   int FIELD1 = 1;
   int FIELD2 = 2;

   void display();
}