package com.christopheradams.num018LambdaExpressionsMoreExamples;

// Definition of a Functional Interface is an interface that has only
// one abstract method.
// In the case of IntCalculator Interface, we have only one abstract method so this
// is a functional interface.
interface IntCalculator
{
   int calculate(int number);

	/* Uncomment this to show a lambda expression that does not
	  return a value: */
	//void calculate(int number);

	/* Uncomment this to show a lambda expression that does not
	  return a value: */
	//int calculate(int number1, int number2);

	/* Uncomment this to show a lambda expression that has not params */
	//void calculate();


}


