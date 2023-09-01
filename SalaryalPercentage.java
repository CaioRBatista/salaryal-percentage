import java.util.Scanner;

public class SalaryalPercentage {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter your salary: ");
      double wage = sc.nextDouble();
      System.out.println("Enter the salary adjustment percentage:  ");
      double result = sc.nextDouble();
      System.out.println("This is the readjustment: " + wage * result / 100);
    }

  }
}
