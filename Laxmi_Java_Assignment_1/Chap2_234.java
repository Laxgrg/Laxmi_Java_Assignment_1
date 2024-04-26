/*
 * Search the Internet to determine the current world population and the annual world population growth rate. Write an application that inputs these values, then displays the estimated world population after one, two, three, four and five years.
 */

 class Chap2_234 {
  public static void main(String[] args) {
  double population = 7.8e9; //7.8 billion according google
  double growthRate = 1.05; // growth rate

  //calculate population for the next 5 years

  int currentYear = 2024;
  System.out.println("Year\tPopulation");

  for(int year = currentYear; year < currentYear + 5; year++) {

  //calculate the population for current year
  population += population * growthRate;

  System.out.printf("%d\t%.2f billion\n", year, population / 1e9);
}

} // main method

} // class 
