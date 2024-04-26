/*Create an application that calculates your daily driving cost, so that you can estimate how much money could be saved by car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic congestion. The application should input the following information and display the user’s cost per day of driving to work:

Total miles driven per day.

Cost per gallon of gasoline.

Average miles per gallon.

Parking fees per day.

Tolls per day.
 * 
 */

 import java.util.Scanner;

 class Chap2_235 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter total miles driven per day: ");
    double milesPerDay = input.nextDouble();

    System.out.println("Enter cost per gallon of gasoline: ");
    double costPerGallon = input.nextDouble();

    System.out.println("Enter average miles per gallon: ");
    double milesPerGallon = input.nextDouble();

   System.out.println("Enter parking fees per day: "); 
   double parkingFee = input.nextDouble();

   System.out.println("Enter Tolls per day: ");
   double tollFee = input.nextDouble();

   double costPerDay = ((milesPerDay / milesPerGallon) * costPerGallon + parkingFee + tollFee);

   System.out.printf("Daily driving cost is: $%.2f\n", costPerDay);
    
  input.close();
   
  } // main method
 } // class 