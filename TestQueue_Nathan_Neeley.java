import java.util.Scanner;
import java.util.InputMismatchException;

public class TestQueue_Nathan_Neeley
{
   public static void main (String[] args)
   {
      Queue_Nathan_Neeley<Integer> myQueue = new Queue_Nathan_Neeley(); //create a list object
      Scanner input = new Scanner(System.in);
      
      int number = -1; 
      int data = 0;
      
      do {
         try {
         //MAIN MENU
            System.out.println("\n---MAIN MENU------"); //heading for options to execute in program
            System.out.println("0 - Exit Program");
            System.out.println("1 - Enqueue");
            System.out.println("2 - Dequeue");
            System.out.println("3 - Front");
            System.out.println("4 - Size");
            System.out.println("5 - Is Empty?");
            System.out.println("6 - Print Queue");
            System.out.print("Enter menu option: "); //prompt user for menu option
            number = input.nextInt(); //read menu option from user
         
            switch (number)
            {
            
               case 0:
                  break;
            
               case 1:
                  System.out.print("Enter new node to be added to queue: "); //prompt user to enter data of new node
                  data = input.nextInt(); //read node from user
                  System.out.println("\nTesting method enqueue()"); //heading
                  System.out.print("Queue content before adding to it: "); //print out stack before adding node
                  if (myQueue.size() == 0)
                     System.out.println("Queue is Empty"); //if stack is empty
                  else {
                     myQueue.printQueue(); //call method to print stack
                     System.out.println(); //print extra line
                  }
                  myQueue.enqueue(data); //call push method
                  System.out.print("Queue content after adding to it:  "); //print out stack after adding node
                  myQueue.printQueue(); //call method to print stack
                  System.out.println(); //print extra line
                  break;
               
               case 2:
                  System.out.println("\nTesting method dequeue()"); //heading
                  System.out.print("Queue content before removing from it: "); //print out stack before removing node
                  if (myQueue.size() == 0)
                     System.out.println("Queue is Empty"); //if stack is empty
                  else {
                     myQueue.printQueue(); //call method to print stack
                     System.out.println(); //print extra line
                  }
                  myQueue.dequeue(); //call pop method
                  System.out.print("Queue content after removing from it:  "); //print out stack after removing node
                  if (myQueue.size() == 0)
                     System.out.println("Queue is Empty"); //if stack is empty
                  else {
                     myQueue.printQueue(); //call method to print stack
                     System.out.println(); //print extra line
                  }
                  break;
            
               case 3:
                  System.out.println("\nTesting method front()"); //heading
                  if (myQueue.size() == 0)
                     System.out.println("Queue is Empty"); //if stack is empty
                  else 
                     System.out.println("Data from Queue: " + myQueue.front()); //print out top data from stack
                  break;
            
               case 4:
                  System.out.println("\nTesting method size()"); //heading
                  System.out.println("Size: " + myQueue.size()); //print out size of stack
                  break;
               
               case 5:
                  System.out.println("\nTesting method isEmpty()"); //heading
                  System.out.println("Is Empty? " + myQueue.isEmpty()); //print out true or false if empty or not
                  break;
               
               case 6:
                  System.out.println("\nTesting method printQueue()"); //heading
                  if (myQueue.size() == 0)
                     System.out.println("Queue is Empty"); //if stack is empty
                  else {
                     System.out.print("Queue: "); //print out stack
                     myQueue.printQueue(); //call method to print stack
                     System.out.println(); //print out extra line
                  }
                  break;
               
               default: 
                  System.out.println("Option not in list. Re-enter menu option."); //default menu option that continues loop
            }
         }
         //catch exception if something besides an integer is entered
         catch (InputMismatchException ex) {
            System.out.println("Invalid input. Re-enter menu option."); //error message
            input.nextLine(); //discard input
         }
      } while (number != 0);
      System.out.println("Program is terminated.");
   }
}
