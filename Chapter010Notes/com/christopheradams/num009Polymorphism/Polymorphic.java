package com.christopheradams.num009Polymorphism;

/**
   This program demonstrates polymorphic behavior.
*/

public class Polymorphic
{
   public static void main(String[] args)
   {
      // Create an array of GradedActivity references.
      GradedActivity[] tests = new GradedActivity[3];

      // We can also create polymorphic objects (not arrays) like this:
      // Normal way of creating GradedActivity() object:
      GradedActivity exam1 = new GradedActivity();

      // Notice we use the GradedActivity class and create a
      // PassFailActivity object.
      GradedActivity exam2 = new PassFailActivity(70);

      // Same with PassFailExam():
      GradedActivity exam3 = new PassFailExam(100, 10, 70);


      // The first test is a regular exam with a
      // numeric score of 75.
      /* Notice we created a GradedActivity[] array and are
      	 storing GradedActivity() objects in it normally. */
      tests[0] = new GradedActivity();
      tests[0].setScore(95);

      // The second test is a pass/fail test. The
      // student missed 5 out of 20 questions, and
      // the minimum passing grade is 60.
      /* Notice we are still using the GradedActivity[] array
      	 but since PassFailExam extends it, we can use
      	 PassFailExam objects in the array as well as other types below */
      tests[1] = new PassFailExam(20, 5, 60);

      // The third test is the final exam. There were
      // 50 questions and the student missed 12.
      /* Using FinalExam objects */
      tests[2] = new FinalExam(50, 7);

      // Display the grades.
      for (int i = 0; i < tests.length; i++)
      {
         System.out.println("Test " + (i + 1) + ": " +
                    "score " + tests[i].getScore() +
                    ", grade " + tests[i].getGrade());
      }
   }
}
