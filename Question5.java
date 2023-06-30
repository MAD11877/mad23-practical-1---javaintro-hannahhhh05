import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     Scanner scanner = new Scanner(System.in);
        
     // Prompt the user to enter the number of integers
     System.out.print("Enter the number of integers: ");
     
     // Read the number of integers entered by the user
     int n = scanner.nextInt();
     
     // Create an array to store the integers
     int[] arr = new int[n];
     
     // Prompt the user to enter the integers
     System.out.printf("Enter %d integers:%n", n);
     
     // Read in the integers entered by the user
     for (int i = 0; i < n; i++) {
         arr[i] = scanner.nextInt();
     }
     
     // Close the scanner object
     scanner.close();

     // Find the mode (highest occurrence) in the array
     int mode = findMode(arr);
     
     // Print out the mode
     System.out.printf("The mode of the set of integers is %d%n", mode);
 }


     public static int findMode(int[] arr) {
         // Sort the array in ascending order
         Arrays.sort(arr);
         
         int maxFreq = 0;
         int mode = arr[0];
         int freq = 1;
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] == arr[i - 1]) {
                 freq++;
             } else {
                 if (freq > maxFreq) {
                     maxFreq = freq;
                     mode = arr[i - 1];
                 }
                 freq = 1;
             }
         }
         
         // Check for the last element
         if (freq > maxFreq) {
             mode = arr[arr.length - 1];
         }
         
         return mode;
    
  }
}
