import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class VoidReturn {
   public static String fullName = "John Doe";
   public static void main(String args[]) {
      int total = addNums();

      System.out.println("Your total is: " + total);

   }

   public static int addNums() {
      System.out.println("We are going to add two numbers");
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter them below");
      int numA = scan.nextInt();
      int numB = scan.nextInt();
      return numA + numB;
   }
}
