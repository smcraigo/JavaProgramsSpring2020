/*     CSCI1015-WS1                                                                                                                                   
       Susan M. Craigo                                                                                                                                
       Program #2                                                                                                                                     
       Program Purpose: Calculates the number of center in a specific number of quarter, nickels and dimes.  User enters the number of quarters,      
       dimes, and nickels.  There will be a calculation done to get number of cents.  The result will be displayed to the monitor and will have the 
       number of quarters, nickels and dimes, as well as the number of cents. */
       
import java.util.Scanner;

public class CraigoPass2
{  
   public static void main(String [] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      /* Asks for number of quarters */
      System.out.print("Enter the number of quarters: ");
      int numberOfQuarters = keyboard.nextInt();
      
      /* Asks for number of dimes */
      System.out.print("Enter the number of dimes: ");
      int numberOfDimes = keyboard.nextInt();
      
      /* Asks for number of nickels */
      System.out.print("Enter the number of nickels: ");
      int numberOfNickels = keyboard.nextInt();
      
      /* Calculates total number of cents */
      int numberOfCents = (numberOfQuarters * 25) + (numberOfDimes * 10) + (numberOfNickels * 5);
      
      /*Outputs to screen */
      System.out.println("Total Quarters entered is " + numberOfQuarters);
      System.out.println("Total Dimes entered is " + numberOfDimes);
      System.out.println("Total Nickels entered is " + numberOfNickels);
      System.out.println("Total cents is " + numberOfCents);
   }
}