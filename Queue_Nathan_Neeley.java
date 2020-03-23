public class Queue_Nathan_Neeley<E>
{
   public Node head, tail;
   private int size = 0;

   //constructor method to create a list of object with head, tail, and size. 
   public Queue_Nathan_Neeley()
   {
      head = null;
      tail = null;
   }
   
   public void enqueue(E data)
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
      size++;
   }   
   
   public void dequeue()
   {
      if (size != 0) {
         head = head.next; //head points to second nodes
         size--;
      }
      if (head == null)
         tail = null; //if empty list   
   }
   
   public E front()
   {
      Node<E> temp = head; //temp points to tail
      return temp.data; //return data of node
   }
   
   public int size()
   {
      return size; //return listSize variable
   }
   
   public boolean isEmpty()
   {
      return size() == 0; //return true or false
   }
   
   public void printQueue() 
   {
      Node<E> temp; //create temp node
      temp = head; //temp points to head
      while (temp != null)
      {
         System.out.print(temp.data + "   "); //print out temp until reaches end of stack
         temp = temp.next; //advance temp by one position
      }
   }
   
   private class Node<E>
   {
      private E data;  //data field
      private Node<E> next; //link field
       
      public Node(E item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

