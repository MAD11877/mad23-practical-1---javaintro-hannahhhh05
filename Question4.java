import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);

    // Prompt the user to enter a integer
    System.out.print("Enter an integer : ");

    // Print the right-angle triangle
    int n = in.nextInt();
    for (int i = n; i >= 1; i--){
        for (int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    // Close the scanner object
    in.close();
    
  }
}
