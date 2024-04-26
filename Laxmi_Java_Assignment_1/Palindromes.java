/*
chapter 4
4.31 (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits long, display an error message and allow the user to enter a new value.
 * 
 */

 import java.util.Scanner; 

 class Palindromes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter five digit integer: "); 
    int number = input.nextInt();

    int promptNum = number;
    int reverseNum = 0;
    int remainder;
    
    while(number > 0) {
      remainder = number % 10;
      reverseNum = reverseNum * 10 + remainder;
      number = number / 10;
    }

    if(promptNum == reverseNum) {
      System.out.println("It's a Palindrome number");
    }
    else {
      System.out.println("It's not a Palindrome, enter a new value");
    }
     
    input.close();

  } // main method
} // class 
    