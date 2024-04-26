/*
 * Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s body mass index. Also, display the BMI categories and their values from the National Heart Lung and Blood Institute
 */

 import java.util.Scanner;

 class Chap2_233 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter weight in pounds: ");
    double weight = input.nextDouble();

    System.out.println("Enter height in inches: ");
    double height = input.nextDouble();

    double bmi = calculateBMI(weight, height);

    System.out.printf("Your BMI is: %.2f%n", bmi);

    System.out.println("\nBMI Categories:");
    System.out.println("Underweight: less than 18.5");
    System.out.println("Normal weight: 18.5–24.9");
    System.out.println("Overweight: 25–29.9");
    System.out.println("Obesity: 30 or greater");

    input.close();
  }    
  
   public static double calculateBMI(double weight, double height) {
        return (weight /(height * height) * 703);

   } //main method

  } // class
  
 