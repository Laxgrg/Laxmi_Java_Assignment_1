import java.util.Scanner;

public class EmployeeTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter emplyee1 firstName: ");
    String firstName = input.nextLine();

    System.out.println("Enter emplyee1 lastName: ");
    String lastName = input.nextLine();

    System.out.println("Enter emplyee1 monthlySalary: ");
    double monthlySalary = input.nextDouble();
    input.nextLine(); // added to read next line 

    System.out.println("Enter emplyee2 firstName: ");
    String firstName2 = input.nextLine();

    System.out.println("Enter emplyee2 lastName: ");
    String lastName2 = input.nextLine();

    System.out.println("Enter emplyee2 monthlySalary: ");
    double monthlySalary2 = input.nextDouble();

    Employee emplyee1 = new Employee (firstName, lastName, monthlySalary);
    Employee emplyee2 = new Employee (firstName2, lastName2, monthlySalary2);

    System.out.println("\nEmployee 1:");
    displayEmployee(emplyee1);
    System.out.println("\nEmployee 2:");
    displayEmployee(emplyee2);

    emplyee1.raisedTenPercent();
    emplyee2.raisedTenPercent();

    System.out.println("\nAfter 10% raise:");
    System.out.println("\nEmployee 1:");
    displayEmployee(emplyee1);
    System.out.println("\nEmployee 2:");
    displayEmployee(emplyee2);

    input.close();
  }

  public static double roundToTwoDecimalPlaces(double value) {
    return Math.round(value * 100.0) / 100.0; // Round to two decimal places
    
  } 
    public static void displayEmployee(Employee emp) {
    System.out.println("First Name: " + emp.getFirstName());
    System.out.println("Last Name: " + emp.getLastName());
    System.out.println("Monthly Salary: " + roundToTwoDecimalPlaces(emp.getMonthlySalary()));
    System.out.println("Annual Salary: " + roundToTwoDecimalPlaces(emp.annaulSalary()));

  } // main method
  
} // class 