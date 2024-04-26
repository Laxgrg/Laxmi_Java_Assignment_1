/*
 * 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum, average, product, smallest and largest of the numbers.
 */
 
 import java.util.Scanner;

 class Chap2_217 {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
 
     System.out.println("Enter first integer: ");
     int num1 = input.nextInt();
 
     System.out.println("Enter second integer: ");
     int num2 = input.nextInt();
 
     System.out.println("Enter third integer:" );
     int num3 = input.nextInt();
 
     int sum = num1 + num2 + num3;
     System.out.printf("Sum of three numbers is: %d\n", sum);
     
     int average = sum / 3;
     System.out.printf("Average of numbers is: %d\n", average);
 
     int product = num1 * num2 * num3;
     System.out.printf("Product of the numbers is: %d\n", product);
 
     //Finding smallest number
     int smallest = num1;
     if(num2 < smallest) {
       smallest = num2;
     }
     if(num3 < smallest)
       smallest = num3;
     //Finding largest number
    int largest = num1; 
    if(num2 > largest) {
     largest = num2;
    }
    if(num3 > largest) {
     largest = num3;
    }
    System.out.printf("Smallest number is: %d\n", smallest);
    System.out.printf("Largest number is: %d\n", largest);
 
    input.close();
 } //main method
  
 } // class clsoed 
 