package com.christopheradams.num004OverridingSuperClassMethods;

/**
   This class computes a curved grade. It extends
   the GradedActivity class.
*/

public class CurvedActivity extends GradedActivity
{
   double rawScore;     // Unadjusted score
   double percentage;   // Curve percentage

   /**
      The constructor sets the curve percentage.
      @param percent The curve percentage.
   */

   public CurvedActivity(double percent)
   {
      percentage = percent;
      rawScore = 0.0;
   }

   /**
      The setScore method overrides the superclass setScore method.
      This version accepts the unadjusted score as an argument. That
      score is multiplied by the curve percentage and the result is
      sent as an argument to the superclass's setScore method.
      @param s The unadjusted score.
   */
   // Notice the @Override keyword. This tells the compiler we intend to
   // override the method but is optional. It is helpful because if
   // we don't ovveride it the compiler will tells us.
   @Override
   public void setScore(double s)
   {
	  // Set this class's field rawScore to value s passed in.
      rawScore = s;

      // Call the GradedActivity class's Constructor and
      // set the score by multiplying the rawScore in this
      // class's field by the field percentage.
      super.setScore(rawScore * percentage);
   }

   /**
      The getRawScore method returns the raw score.
      @return The value in the rawScore field.
   */

   public double getRawScore()
   {
      return rawScore;
   }

   /**
      The getPercentage method returns the curve
      percentage.
      @return The value in the percentage field.
   */

   public double getPercentage()
   {
      return percentage;
   }
}