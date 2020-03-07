/*     CSCI1015-WS1                                                                                                                                   */
/*     Susan M. Craigo                                                                                                                                */
/*     Program #4                                                                                                                                     */
/*     Input: A, B or C while are different types of subscription packages and the number of hours used                                               */ 
/*     Purpose: Calculates the monthly bill of a customer and calculates the savings for customer had they gotten a different package                 */
/*     Process: Making decidions in a program using decision structures                                                                               */
/*     Output: Displays to the monitor monthly subscription charges and the amount the monthly bill would be for the other two packages               */
       
import java.util.Scanner;

public class CraigoPass4
{  
   public static void main(String [] args)
   {
      /* Initializes variables */
      String subscriptionPackage; /* Input of subscription package by user */
      int numberOfHours; /* Input of number of hours internet was used by user */
      int additionalHoursA; /* Holds result of calculation to find number of hours over 10 hours of access with package A */
      int additionalHoursB; /* Holds result of calculation to find number of hours over 20 hours of access with package B */
      double aCharges = 0; /* Initializes the variable of aCharges */
      double bCharges = 0; /* Initializes the variable of bCharges */
      double cCharges = 0; /* Initializes the variable of cCharges */
      
      /* 5 constants as required by program */
      final double packageA = 9.95; /* Initializes the variable with amount of package A */
      final double packageB = 13.95; /* Initializes the variable with amount of package B */
      final double packageC = 19.95; /* Initializes the variable with amount of package C */
      final double aHourlyRate = 2.00; /* Initializes the variable with hourly cost of additional hours for package A */
      final double bHourlyRate = 1.00; /* Initializes the variable with hourly cost of additional hours for package A */
            
      Scanner keyboard = new Scanner(System.in);
      
      /* Asks for the subscription package the customer has */
      System.out.printf("Enter the customer's package (A, B, or C):      ");
      subscriptionPackage = keyboard.nextLine();
      
      /* Asks for the number of hours used from customer */
      System.out.printf("Enter the number of hours used:                 ");
      numberOfHours = keyboard.nextInt();
      
      /* Switch statement to determine what happens upon input */
      switch (subscriptionPackage)
      {
         case "A":
         case "a":
         
            /* Determine how many hours over 10 the internet was used for package A */
            additionalHoursA = numberOfHours - 10;
            
            /* If loop to determine pricing if customer only used 10 hours for internet */
            if (additionalHoursA <= 0)
            {
                aCharges = packageA;
                /* Print output to screen */
                System.out.printf("%-48s%s%.2f%s", "The charges are: ", "$", aCharges, "\n");
            }
            else /* Determines pricing if customer used more than 10 hours of internet */
            { 
               /* Determine how much internet service subscription package A is */
               aCharges = (packageA + (additionalHoursA * aHourlyRate));
               /* Print output to screen */
               System.out.printf("%-48s%s%.2f%s", "The charges are: ", "$", aCharges, "\n"); 
            }
               
            /* Determine how many hours over 20 the internet was used for package B for savings */
            additionalHoursB = numberOfHours - 20;
            
            /* If loop to determine pricing if customer only used 20 hours of internet */
            if (additionalHoursB <= 0)
            {
               bCharges = packageB;
            }
            else /* Determines pricing if customer used more than 20 hours of internet */
            {  
               /* Determine how much internet service subscription package B is for savings */
               bCharges = aCharges - (packageB + (additionalHoursB * bHourlyRate));
               System.out.printf("%-48s%s%.2f%s", "With package B you would have saved: ", "$", bCharges, "\n");
            }
            
            /* If loop to determine if package C cost is less than package A */
            if (packageC < aCharges) 
            {  
               /* Determine how much savings internet service subscription C is */  
               cCharges = aCharges - packageC;              
               System.out.printf("%-48s%s%.2f%s", "With package C you would have saved: ", "$", cCharges, "\n");
            }
            else
            {
               break;
            }      
                     
            break;
            
         case "B":
         case "b":
            /* Determine how many hours over 20 the internet was used */
            additionalHoursB = numberOfHours - 20;
               
            /* If loop to determine pricing if customer only used 20 hours for internet */
            if (additionalHoursB <= 0)
            {
               bCharges = packageB;
               
               /* Print output to screen */
               System.out.printf("%-48s%s%.2f%s", "The charges are: ", "$", bCharges, "\n");
            }
            else /* Determines pricing if customer used more than 20 hours of internet */
            {             
               /* Determine how much internet service subscription package B is */
               bCharges = (packageB + (additionalHoursB * bHourlyRate));
               
               /* Determine how much savings internet service subscription C is */  
               cCharges = bCharges - packageC;          
            
               /* Print output to screen */
               System.out.printf("%-48s%s%.2f%s", "The charges are: ", "$", bCharges, "\n");
               System.out.printf("%-48s%s%.2f%s", "With package C you would have saved: ", "$", cCharges, "\n");
            }
            break;
            
         case "C":
         case "c":
            /* Since C package is umlimited, it is $19.95 */
            cCharges = packageC;
         
            /* Print output to screen */
            System.out.printf("%-48s%s%.2f%s", "The charges are: ", "$", cCharges, "\n");
            break;
         default: /* Lets user know if they have entered an invalid input for internet package */
            System.out.printf("Invalid input!");
            break;    
       }
   }        
}