/*
 * Chapter 5
 * 5.29 (“The Twelve Days of Christmas” Song) Write an application that uses iteration and switchstatements to print the song “The Twelve Days of Christmas.” One switch statement should be used to print the day (“first,” “second,” and so on). A separate switch statement should be used to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_ of_Christmas_(song) for the lyrics of the song.
 */

 class ChristmasSong {
  public static void main(String[] args) {

    for(int i = 1; i <=12; i++) {
      int day = i;
      switch (day) {
        case 1:
          System.out.println("1st day: A partridge in a pear tree");
          break;
        case 2:
          System.out.println("2rd day: Two turtle doves");  
          break;
        case 3:
          System.out.println("3rd day: Three French hens");  
          break;
        case 4: 
          System.out.println("4th day: four calling birds");
          break;
        case 5:
          System.out.println("5th day: five gold rings");
          break;
        case 6:
          System.out.println("6th day: six geese a-laying");
          break;
        case 7:
          System.out.println("7th day: seven swans a-swimming");
          break;
        case 8: 
          System.out.println("8th day: eight maids a-milking");
          break;
        case 9: 
          System.out.println("9th day: nine ladies dancing");
          break;
        case 10:
          System.out.println("10th day: ten lords a-leaping");
          break;
        case 11:
          System.out.println("11th day: eleven pipers piping");
          break;
        case 12: 
          System.out.println("12th day: twelve drummers drumming");
          break;
      }
    }
  } // main method
 } // class 

