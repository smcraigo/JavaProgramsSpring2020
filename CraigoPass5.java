/*     CSCI1015-WS1                                                                                                                                   */
/*     Susan M. Craigo                                                                                                                                */
/*     Program #5                                                                                                                                     */
/*     Input: Starting number of organisms, average daily population increase as a percentage, and number of days they will multiply                  */ 
/*     Purpose: Predicts the size of a population of organisms                                                                                        */
/*     Process: Using a loop structure                                                                                                                */
/*     Output: Displays to the monitor the number of organisms over however many days the user inputs, if all input values are valid                  */
       
import java.util.Scanner;

public class CraigoPass5
{  
   public static void main(String [] args)
   {
      /* Initializes variables */
      double numberOrganisms; /* Input of number of organisms we are starting out with */
      double dailyIncreasePercentage; /* Input of percentage of daily increase of organisms */
      int numberDays; /* Input of number of days organisms will multiply */
      double organisms; /* Holds the number of organisms */
                   
      Scanner keyboard = new Scanner(System.in);
      
      /* Asks for the starting number of organisms */
      System.out.print("Enter the starting number of organisms: ");
      numberOrganisms = keyboard.nextInt();
      
      /* Validates the number of organisms input, which needs to be at least 2 */
      if (!(numberOrganisms >= 2))
      {
         do
         {
            System.out.print("Invalid. Must be at least 2. Re-enter: ");
            numberOrganisms = keyboard.nextInt();
         }
         while(!(numberOrganisms >= 2));
      }
      
      /* Asks for the daily increase of organisms in percentage */
      System.out.print("Enter the daily increase percentage: ");
      dailyIncreasePercentage = keyboard.nextInt();
      
      /* Validates the daily increase input, which needs to be a positive number */
      if (!(dailyIncreasePercentage >= 0))
      {
         do
         {
            System.out.print("Invalid. Enter a non-negative number: ");
            dailyIncreasePercentage = keyboard.nextInt();
         }
         while(!(dailyIncreasePercentage >= 0));
      }
      
      /* Asks for the number of days organisms will grow */
      System.out.print("Enter the number of days the organisms will multiply: ");
      numberDays = keyboard.nextInt();
      
      /* Validates the days organisms will grow input, which needs to be at least 1 */
      if (!(numberDays >= 1))
      {
         do
         {
            System.out.print("Invalid. Enter 1 or more: ");
            numberDays = keyboard.nextInt();
         }
         while(!(numberDays >= 1));
      }
      
      System.out.println();
      
      System.out.printf("%-10s%-10s", "Day", "Organisms\n");
      System.out.printf("%s","------------------------\n");
      
      /* Set value of organism equal to the input of starting organisms */
      organisms = numberOrganisms;
      
      /* Loop to calculate the number organisms over number of days input by user, multiplied by daily increase percentage, input by user */
      for (int i = 1; i <= numberDays; i++)
      {
         System.out.printf("%-10d%-10s%s", i, organisms, "\n");
         organisms = organisms + (organisms * (dailyIncreasePercentage / 100));
      }
   }
}