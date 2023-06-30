import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    // Create a Scanner object to read user input
    Scanner in = new Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");
        
    // Read the integer entered by the user
    int number = in.nextInt();
    
    // Multiply the integer by itself
    int result = number * number;
    
    // Print the result
    System.out.printf("The result of %d multiplied by itself is %d", number, result);
    
    // Close the scanner object
    in.close();
    
  }
}
