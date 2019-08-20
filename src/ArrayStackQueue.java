/** M Madden, Nov 2005: Array implementation of Stack ADT  */

import javax.swing.JOptionPane;

public class ArrayStackQueue {
   protected int capacity; 			// The actual capacity of the stack array
   protected static final int CAPACITY = 1000;	// default array capacity
   protected Object S[];			// array used to implement the stack 
   protected int top = -1;			// index for the top of the stack
   
   public ArrayStackQueue() {
	  
	   this(CAPACITY);
   }

   public ArrayStackQueue(int cap) {
	  // this constructor allows you to specify capacity of stack
	  capacity = (cap > 0) ? cap : CAPACITY;
	  S = new Object[capacity]; 
   }
   
   public void push(Object element) {
	 if (isFull()) {
	   JOptionPane.showMessageDialog(null, "ERROR: Stack is full.");
	   return;
	 }
	 top++;
	 S[top] = element;
   }

   public Object pop() {
	  Object element;
	  if (isEmpty()) {
	     JOptionPane.showMessageDialog(null, "ERROR: Stack is empty.");
	     return  null;
	  }
	  element = S[top];
	  S[top] = null;
	  top--;
	  return element;
   }

   public Object top() {
	 if (isEmpty()) {
		 JOptionPane.showMessageDialog(null, "ERROR: Stack is empty.");
		 return null;
	 }
	 return S[top];
   }
	   
   public boolean isEmpty() {
		  return (top < 0);
   }

   public boolean isFull() {
		  return (top == capacity-1);
   }

   public int size() { 
		 return (top + 1);
   }
   
   public static class ArrayQueue {  
		
		 protected Object Q[];				// array used to implement the queue 
		 protected int rear = -1;			// index for the rear of the queue
		 protected int capacity; 			// The actual capacity of the queue array
		 public static final int CAPACITY = 1000;	// default array capacity
		   
		 public ArrayQueue() {
			   // default constructor: creates queue with default capacity
			   this(CAPACITY);
		 }

		 public ArrayQueue(int cap) {
			  // this constructor allows you to specify capacity
			  capacity = (cap > 0) ? cap : CAPACITY;
			  Q = new Object[capacity]; 
		 }
		 
		 public void enqueue(Object n)
		 {
			 if (isFull()) {
				 JOptionPane.showMessageDialog(null, "Cannot enqueue object; queue is full.");
				 return;
			 }
			 rear++;
			 Q[rear] = n;
		 }
		 
		 public Object dequeue()
		 {
			 // Can't do anything if it's empty
			 if (isEmpty())
				 return null;
			 
			 Object toReturn = Q[0];
			 
			 // shuffle all other objects towards 0
			 int i = 1;
			 while (i <= rear) {
				 Q[i-1] = Q[i];
				 i++;
			 }
			 rear--;
			 return toReturn;
		 }
		 
		 public boolean isEmpty()  {
		     return (rear < 0);
		 }
		 
		 public boolean isFull() {
			 return (rear == capacity-1);
		 }
		 
		 public Object front()
		 {
			 if (isEmpty())
				 return null;
			 
			 return Q[0];
		 }
	}

 }
