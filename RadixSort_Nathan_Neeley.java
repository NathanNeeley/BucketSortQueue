import java.util.Scanner;
import java.util.InputMismatchException;

public class RadixSort_Nathan_Neeley
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      int data = 0;
      int size = 0;
      
      //prompt user
      System.out.print("Enter number of positive integers: ");
      size = input.nextInt();
      int[] inputs = new int[size];
      
      //prompt user 
      System.out.print("Enter " + size + " positive integers: ");
      for (int i = 0; i < inputs.length; i++)
         inputs[i] = input.nextInt();
      
      //print out array before sorting
      System.out.print("Array inputs before sorting: ");
      for (int i = 0; i < inputs.length; i++) {
         if (i < inputs.length - 1)
            System.out.print(inputs[i] + ", ");
         else
            System.out.println(inputs[i]);
      }
      
      //method call
      sort(inputs);
      System.out.print("Array inputs after sorting:  ");
      for (int i = 0; i < inputs.length; i++) {
         if (i < inputs.length - 1)
            System.out.print(inputs[i] + ", ");
         else
            System.out.println(inputs[i]);
      }
      
   }
   
   public static void sort(int[] inputs)
   {
      int index = 0;
      Queue_Nathan_Neeley<Integer> queue0 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue1 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue2 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue3 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue4 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue5 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue6 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue7 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue8 = new Queue_Nathan_Neeley(); //create a list object
      Queue_Nathan_Neeley<Integer> queue9 = new Queue_Nathan_Neeley(); //create a list object
   
      for (int i = 0; i < DigitCount(inputs); i++) {
         
         for (int j = 0; j < inputs.length; j++) {
            
            //call method
            int result = ExtractDigit(inputs[j], i);
            
            //store in queue
            switch (result) {
               
               case 0:
                  queue0.enqueue(inputs[j]);
                  break;
               case 1:
                  queue1.enqueue(inputs[j]);
                  break;
               case 2:
                  queue2.enqueue(inputs[j]);
                  break;
               case 3:
                  queue3.enqueue(inputs[j]);
                  break;
               case 4:
                  queue4.enqueue(inputs[j]);
                  break;
               case 5:
                  queue5.enqueue(inputs[j]);
                  break;
               case 6:
                  queue6.enqueue(inputs[j]);
                  break;
               case 7:
                  queue7.enqueue(inputs[j]);
                  break;
               case 8:
                  queue8.enqueue(inputs[j]);
                  break;
               case 9:
                  queue9.enqueue(inputs[j]);
                  break;
               default:
                  queue0.enqueue(inputs[j]);
                  break;
            }
         }
         //sort and dequeue
         while (!queue0.isEmpty()) {
            inputs[index] = queue0.front();
            queue0.dequeue();
            index++;
         }
         while (!queue1.isEmpty()) {
            inputs[index] = queue1.front();
            queue1.dequeue();
            index++;
         }
         while (!queue2.isEmpty()) {
            inputs[index] = queue2.front();
            queue2.dequeue();
            index++;
         }
         while (!queue3.isEmpty()) {
            inputs[index] = queue3.front();
            queue3.dequeue();
            index++;
         }
         while (!queue4.isEmpty()) {
            inputs[index] = queue4.front();
            queue4.dequeue();
            index++;
         }
         while (!queue5.isEmpty()) {
            inputs[index] = queue5.front();
            queue5.dequeue();
            index++;
         }
         while (!queue6.isEmpty()) {
            inputs[index] = queue6.front();
            queue6.dequeue();
            index++;
         }
         while (!queue7.isEmpty()) {
            inputs[index] = queue7.front();
            queue7.dequeue();
            index++;
         }
         while (!queue8.isEmpty()) {
            inputs[index] = queue8.front();
            queue8.dequeue();
            index++;
         }
         while (!queue9.isEmpty()) {
            inputs[index] = queue9.front();
            queue9.dequeue();
            index++;
         }
         index = 0;
      }
   }
   
   public static int ExtractDigit(int number, int place)
   {            
      for(int i = 0; i < place; i++)
      {
         number = number/10;
      }
      
      return number%10;
   }
   
   public static int DigitCount(int[] inputs) 
   {
      int count = 1;
      int max = 0;
      for (int i = 0; i < inputs.length; i++) {
         if (inputs[i] > max)
            max = inputs[i];
      }
      while (max > 1) {
         max = max/10;
         count++;
      }
      
      return count;
   }
}
