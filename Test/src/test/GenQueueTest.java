package test;

import java.util.Scanner;

;
public class GenQueueTest {
	
	 
	  public static void main(String[] args) {
		    GenQueue<Integer> qint= new GenQueue<Integer>();
		    GenQueue<String> qString= new GenQueue<String>();
		    Scanner scanner = new Scanner(System.in);
		   qint.enqueue(new Integer (3));
		   qint.enqueue(new Integer (15));
		   qint.enqueue(new Integer (22));
		   
		   qString.enqueue(new String("Mercury"));
		   qString.enqueue(new String("Venus"));
		   qString.enqueue(new String("Earth"));
		    
		   System.out.println("Queue");
		   qint.show();
		   qString.show();
		   System.out.println("1.Enter element to add element in queue");
		   int addInt=scanner.nextInt();
		   qint.enqueue(addInt);
		   String addString=scanner.next();
		   qString.enqueue(addString);
		   qint.show();
		   qString.show();
		   System.out.println("2.Enter GET to get element from queue");
		   String get=scanner.next();
		   qint.dequeue();
		   qString.dequeue();
		   qint.show();
		   qString.show();
		   System.out.println("3.Enter CHECK to check if queue is empty");
		   String check=scanner.next();
		   if(qint.hasItems()==true) {
		   System.out.println(" Integer Queue is not empty")	;	   
		  }
		   		else if (qint.hasItems()==false) {
			   System.out.println(" Integer Queue is empty")	;  
		   }
		   if(qString.hasItems()==true) {
			   System.out.println(" String Queue is not empty")	;	   
			  }
			   else if (qString.hasItems()==false) {
				   System.out.println(" String Queue is empty")	;  
			   }
		   System.out.println("4.Enter Size to get size of queue");
		   String size=scanner.next();
		   System.out.println(qint.size());
		   System.out.println(qString.size());
		   
		   
		
	}
}
