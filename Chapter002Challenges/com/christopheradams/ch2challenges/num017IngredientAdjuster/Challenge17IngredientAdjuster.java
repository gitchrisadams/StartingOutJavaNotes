package com.christopheradams.ch2challenges.num017IngredientAdjuster;

/**
 * Created by Christopher on 5/12/2016.
 * A cookie recipe calls for:
 * 1.5cups of sugar
 * 1 cup of butter
 * 2.75 cups of flour
 * Produces 48 cookies with above recipe.
 * This program asks the user how many cookies to make.
 * Ingredients are adjusted based on cookie amount entered.
 */
import java.util.Scanner;


public class Challenge17IngredientAdjuster {
    public static void main(String[]args)
    {
        /***** Create variables *****/
        // Store the value of each ingredient/48 since recipe makes 48 cookies.
        double sugar = 1.5/48;
        double butter = 1.0/48;
        double flour = 2.75/48;
        int cookies = 0;

        // Ask user how many cookies they want to make.
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many cookies are you making? ");
        cookies = scanner.nextInt();

        // Multiply ingredients for one cookie by amount of
        // cookies entered by user.
        sugar = sugar * cookies;
        butter = butter * cookies;
        flour = flour * cookies;

        // Display Output:
        System.out.println("The recipe for " + cookies + " cookies is:");
        System.out.println("Sugar: " + sugar + " cups");
        System.out.println("Butter: " + butter + " cups");
        System.out.println("Flout: " + flour + " cups");


    }
}
