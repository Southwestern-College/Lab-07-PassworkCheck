import java.util.Scanner;

/**
 * Program description here
 *
 * @author Your Name Here
 */
public class PasswordCheck {

  public static void main(String[] args) {
      // Create a Scanner object to receive user input from keyboard
      Scanner input = new Scanner(System.in);

      String password;
      
      // Prompt user for a password until they enter a valid password
      do {
          System.out.println("Please enter a password:");
          password = input.nextLine();
      } while (!isValidPassword(password));

      System.out.println("Success");
  } 

  public static boolean isValidPassword(String password) { 
      // Complete this code
  }

  public static boolean isUpperCase(char ch) {
      // Complete this code
  }

  public static boolean isLowerCase(char ch) {
      // Complete this code
  }

  public static boolean isDigit(char ch) {
      // Complete this code
  }

  public static boolean isSpecialCharacter(char ch) {
      // Complete this code
  }
}
