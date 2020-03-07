/*     CSCI1015-WS1                                                                                                                                   */
/*     Susan M. Craigo                                                                                                                                */
/*     Program #6                                                                                                                                     */
/*     Input: Theater number, number of adult tickets, number of child tickets and number of popcorn                                                  */ 
/*     Purpose: Uses a loop structure determine number of adult and child tickets, as well as number of popcorns for 2 theaters                       */
/*     Process: Using a loop structure with a sentinel -999                                                                                           */
/*     Output: Displays to the monitor the theater, number of adult tickets, number of child tickets and number of popcorns                           */
       
import java.util.Scanner;

public class CraigoPass6
{  
   public static void main(String [] args)
   {
      /* Initializes variables */
      int theaterNumber; /* Input of theater number */
      int numberAdultTickets1 = 0; /* Input of number of adult tickets sold for theater 1 */
      int numberChildTickets1 = 0; /* Input of number of child tickets sold for theater 1 */
      int numberPopcorn1 = 0; /* Input of number of popcorn sold for theater 1 */
      
      int numberAdultTickets2 = 0; /* Input of number of adult tickets sold for theater 2 */
      int numberChildTickets2 = 0; /* Input of number of child tickets sold for theater 2 */
      int numberPopcorn2 = 0; /* Input of number of popcorn sold for theater 2 */
      
      int totalAdultTickets1 = 0; /* Holds calculation of number of adult tickets sold for theater 1 */
      int totalChildTickets1 = 0; /* Holds calculation of number of child tickets sold for theater 1 */
      int totalNumberPopcorn1 = 0; /* Holds calculation of number of popcorn sold for theater 1 */
      
      int totalAdultTickets2 = 0; /* Holds calculation of number of adult tickets sold for theater 2 */
      int totalChildTickets2 = 0; /* Holds calculation of number of child tickets sold for theater 2 */
      int totalNumberPopcorn2 = 0; /* Holds calculation of number of popcorn sold for theater 2 */
      
      double totalTickets1 = 0; /* Holds calculation of amount of tickets sold for theater 1 */
      double totalPopcorn1 = 0; /* Holds calculation of amount of popcorn sold for theater 1 */
      double totalSales1 = 0; /* Holds calculation of total sales for theater 1 */
      
      double totalTickets2 = 0; /* Holds calculation of amount of tickets sold for theater 2 */
      double totalPopcorn2 = 0; /* Holds calculation of amount of popcorn sold for theater 2 */
      double totalSales2 = 0; /* Holds calculation of total sales for theater 2 */      
                   
      Scanner keyboard = new Scanner(System.in);
      
      do /* loops through as long as sentinel is not entered */
      {
         /* Gets input of theater number from user */
         System.out.println();
         System.out.print("Enter theater number: ");
         theaterNumber = keyboard.nextInt();
      
         switch (theaterNumber) 
         {
         case 1: /* For theater 1 */
            /* Accepts input from user for number of adult tickets for theater 1 */
            System.out.print("Adult Tickets: ");
            numberAdultTickets1 = keyboard.nextInt();
            /* Accepts input from user for number of child tickets for theater 1 */
            System.out.print("Child Tickets: ");
            numberChildTickets1 = keyboard.nextInt();
            /* Accepts input from user for number of popcorn sold for theater 1 */
            System.out.print("Popcorn: ");
            numberPopcorn1 = keyboard.nextInt();
         
            /* Calculate total adult tickets sold */
            totalAdultTickets1 = totalAdultTickets1 + numberAdultTickets1;
         
            /* Calculate total child tickets sold */
            totalChildTickets1 = totalChildTickets1 + numberChildTickets1;
         
            /* Calculate total popcorns sold */
            totalNumberPopcorn1 = totalNumberPopcorn1 + numberPopcorn1;

            break;
            
         case 2: /* For theater 2 */
            /* Accepts input from user for number of adult tickets for theater 2*/
            System.out.print("Adult Tickets: ");
            numberAdultTickets2 = keyboard.nextInt();
            /* Accepts input from user for number of child tickets for theater 2*/
            System.out.print("Child Tickets: ");
            numberChildTickets2 = keyboard.nextInt();
            /* Accepts input from user for number of popcorn sold for theater 2*/
            System.out.print("Popcorn: ");
            numberPopcorn2 = keyboard.nextInt();
         
            /* Calculate total adult tickets sold */
            totalAdultTickets2 = totalAdultTickets2 + numberAdultTickets2;
         
            /* Calculate total child tickets sold */
            totalChildTickets2 = totalChildTickets2 + numberChildTickets2;
         
            /* Calculate total popcorns sold */
            totalNumberPopcorn2 = totalNumberPopcorn2 + numberPopcorn2;

            break;
         default: /* For any other number that is not the sentinel number */
            if (theaterNumber != -999)
            {
            System.out.print("Invalid number!");
            }
            break;
         }
      }
      while (theaterNumber != -999); /* for the sentinel number to break the switch loop */
      
      System.out.println();
      
      /* Calculations for totals for theater 1*/
     totalTickets1 = (9.50 * totalAdultTickets1) + (6.00 * totalChildTickets1); /* Calculates total cost of tickets sold for theater 1 */
     totalPopcorn1 = (8.00 * totalNumberPopcorn1); /* Calculates total cost of popcorn sold for theater 1 */
     totalSales1 = totalTickets1 + totalPopcorn1; /* Calculates total cost of tickets and popcorn for theater 1 */
     
     /* Calculations for totals for theater 2 */
     totalTickets2 = (12.50 * totalAdultTickets2) + (7.50 * totalChildTickets2); /* Calculates total cost of tickets sold for theater 2 */
     totalPopcorn2 = (6.50 * totalNumberPopcorn2); /* Calculates total cost of popcorn sold for theater 2 */
     totalSales2 = totalTickets2 + totalPopcorn2; /* Calculates total cost of tickets and popcorn for theater 2 */
           
      System.out.println("Theater 1: "); /* Prints out totals for theater 1 */
      System.out.println("   Adult Tickets: " + totalAdultTickets1); /* Prints to monitor total adult tickets sold for theater 1 */
      System.out.println("   Child Tickets: " + totalChildTickets1); /* Prints to monitor total adult tickets sold for theater 1 */
      System.out.println("   Popcorn: " + totalNumberPopcorn1); /* Prints to monitor total adult tickets sold for theater 1 */
      System.out.printf("%15s%s%.2f%s", "   Total Tickets: ", "$", + totalTickets1, "\n"); /* Prints to monitor total ticket sales for theater 1 */
      System.out.printf("%15s%s%.2f%s", "   Total Popcorn: ", "$", + totalPopcorn1, "\n"); /* Prints to monitor total popcorn sales for theater 1 */
      System.out.printf("%15s%s%.2f%s", "   Total Sales: ", "$", + totalSales1, "\n"); /* Prints to monitor total sales for tickets and popcorn for theater 1 */
      System.out.println();
      System.out.println("Theater 2: "); /* Prints out totals for theater 2 */
      System.out.println("   Adult Tickets: " + totalAdultTickets2); /* Prints to monitor total adult tickets sold for theater 2 */
      System.out.println("   Child Tickets: " + totalChildTickets2); /* Prints to monitor total child tickets sold for theater 2 */
      System.out.println("   Popcorn: " + totalNumberPopcorn2); /* Prints to monitor total popcorn sold for theater 2 */
      System.out.printf("%15s%s%.2f%s", "   Total Tickets: ", "$", + totalTickets2, "\n"); /* Prints to monitor total tickets sales for theater 2 */
      System.out.printf("%15s%s%.2f%s", "   Total Popcorn: ", "$", + totalPopcorn2, "\n"); /* Prints to monitor total popcorn sales for theater 2 */
      System.out.printf("%15s%s%.2f%s", "   Total Sales: ", "$", + totalSales2, "\n");  /* Prints to monitor total sales for tickets and popcorn for theater 2 */
}
}