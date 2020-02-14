/*     CSCI1015-WS1                                                                                                                                   */
/*     Susan M. Craigo                                                                                                                                */
/*     Program #3                                                                                                                                     */
/*     Input: Number of people attending the party                                                                                                    */ 
/*     Purpose: Calculates the total cost of a party                                                                                                  */
/*     Process: Learn how to use different data types such as doubles, constants, and the % and / operators for integers                              */
/*     Output: Displays to the monitor number of people attending party, with costs of pizza, drinks and cake                                         */
       
import java.util.Scanner;

public class CraigoPass3
{  
   public static void main(String [] args)
   {
      /* Initializes variables */
      int numberOfAttendees, numberOfWholePizzas, numberOfPizzaSlices, numberOfWholeCakes, numberOfCakeSlices, numberOfDrinks;
      double costOfPizzas, costOfCake, costOfDrinks, subtotal, tax, totalDue;
      final double wholePizza = 9.25;
      final double pricePerPizzaSlice = 1.25;
      final double wholeCake = 20.00;
      final double pricePerCakeSlice = 1.00;
      final double pricePerDrink = 0.75;
      final double taxRate = 0.095;
      
      Scanner keyboard = new Scanner(System.in);
      
      /* Asks for number of people going to party */
      System.out.print("Enter the number attending the party: ");
      numberOfAttendees = keyboard.nextInt();
      System.out.println();
      
      /* Calculates number of whole pizzas needed as well as how many slizes - each attendee will eat 4 slices of pizza */ 
      /* 1 pizza equals 8 slices */
      numberOfWholePizzas = (numberOfAttendees * 4) / 8;
      numberOfPizzaSlices = (numberOfAttendees * 4) % 8;
            
      /* Calculates the cost of pizza */
      /* Whole pizza costs $9.25 */      
      /* Each slice costs $1.25 */
      costOfPizzas = (wholePizza * numberOfWholePizzas) + (pricePerPizzaSlice * numberOfPizzaSlices);
      
      /* Calculates number of cakes as well as how many slice each attendee will eat 1 piece of cake */ 
      numberOfWholeCakes = numberOfAttendees / 24;
      numberOfCakeSlices = numberOfAttendees % 24;
      
      /* Calculates the cost of cake - each cake costs $20 and each slice is $1 a slice */
      costOfCake = (wholeCake * numberOfWholeCakes) + (pricePerCakeSlice * numberOfCakeSlices);
      
      /* Calculates the number of drinks needed for party - each attendee will drink 2 drinks */ 
      numberOfDrinks = numberOfAttendees * 2;
      
      /* Calculates the cost of drinks */
      /* Cost per drink is $0.75 */
      costOfDrinks = numberOfDrinks * pricePerDrink; 
      
      /* Calculates the subtotal */
      subtotal = costOfPizzas + costOfCake + costOfDrinks;
      
      /* Calculates the tax */
      tax = subtotal * (taxRate);
      
      /* Calculates the total */
      totalDue = subtotal + tax;          
      
      /*Outputs to screen */
      System.out.println("The number attending is " + numberOfAttendees);
      System.out.println("---");
      System.out.println("The number of whole pizzas required is " + numberOfWholePizzas);
      System.out.println("The number of extra pieces is " + numberOfPizzaSlices);
      System.out.printf("%s%.2f", "Total Cost of Pizza: $" , costOfPizzas);
      System.out.println();
      System.out.println("---");
      System.out.println("The number of whole cakes required is " + numberOfWholeCakes);
      System.out.println("The number of additional pieces of cake is " + numberOfCakeSlices);
      System.out.printf("%s%.2f","Total Cost of Cake: $" , costOfCake);
      System.out.println();
      System.out.println("---");
      System.out.println("The number of drinks required is " + numberOfDrinks);
      System.out.printf("%s%.2f","The cost of the drinks is $" , costOfDrinks);
      System.out.println();
      System.out.println();
      System.out.printf("%s%.2f","Subtotal: " , subtotal);
      System.out.println();
      System.out.printf("%s%.2f","Tax: " , tax);
      System.out.println();
      System.out.printf("%s%.2f","Total: " , totalDue);
      }
}