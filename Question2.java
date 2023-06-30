import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
     // Create a Scanner object to read user input
    Scanner in = new Scanner(System.in);

    // Find out the user's height
    double height = in.nextDouble();

    // Find out user's weight
    double weight = in.nextDouble();

    // Calculate BMI
    double bmi = weight/ (height*height);

    // Print the result
    System.out.printf("Your BMI is %.2f\n", bmi);

    // Classify the BMI
    if (bmi < 18.5) {
      System.out.println("Underweight");
  } else if (bmi >= 18.5 && bmi < 25) {
      System.out.println("Normal weight");
  } else if (bmi >= 25 && bmi < 30) {
      System.out.println("Overweight");
  } else {
      System.out.println("Obese");
  }
  
  // Close the scanner object
  in.close();


  }
}
