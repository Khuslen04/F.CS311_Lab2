package test;

import java.util.LinkedList;

public class GenQueue<Generic> {
	  private LinkedList<Generic> list = new LinkedList<Generic>();

	  public void enqueue(Generic item) {
	    list.addLast(item);		//element oruulah function
	  }

	  public Generic dequeue() {
	    return list.poll(); //element avah function
	  }

	  public boolean hasItems() {
	    return !list.isEmpty();		//jagsaalt hooson esehiig shalgah
	  }

	  public int size() {		// jagsaaltin hemjee harah
	    return list.size();
	  }
	  public void show() {				//jagsaalting haruulah
		  System.out.println(list);
	  }

	/* public void addItems(GenQueue<? extends E> q) {
	    while (q.hasItems())
	      list.addLast(q.dequeue());
	  }*/
}
