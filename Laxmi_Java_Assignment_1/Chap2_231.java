/*
 * write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in table format, as shown below.
 */
class Chap2_231 {
  public static void main(String[] args) {
    int square, cube;
    System.out.println("Number Square Cube\n");
    for(int num = 0; num <=10; num++) {
        square = num * num;
        cube = num * num * num;
        System.out.printf("%d\t%d\t%d\n", num, square, cube);
    }
  }  // main method
} // class 