/*
 * Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result.
 */
import java.util.Scanner;

class Chap2_226 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first integer: ");
    int num1 = input.nextInt();

    System.out.println("Endter second integer: ");
    int num2 = input.nextInt();

    if(num1 % num2 == 0) {
      System.out.println(num1 + " is multiple of " + num2);
    } 
    else {
      System.out.println(num1 + " is not multiple of " + num2);
    }
   input.close();

  } //main method
} // class 
