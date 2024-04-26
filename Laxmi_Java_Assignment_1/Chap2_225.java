/*
 * Write an application that reads an integer and determines and prints whether it’s odd or even.
 */
import java.util.Scanner;

class Chap2_225 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int number = input.nextInt();

    if(number % 2 == 0) {
      System.out.println("Number is even.");
    }
    else {
      System.out.println("Number is odd.");
    }
    input.close();
    
  } // main method
} // class 