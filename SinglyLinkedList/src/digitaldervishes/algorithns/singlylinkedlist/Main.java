package digitaldervishes.algorithns.singlylinkedlist;

import java.io.IOException;

public class Main {
	
	public static void main (String [] args) throws IOException
	{
		Node first = new Node(1, null);
		int numberofnodes, nodetokill;
		//System.out.println("please enter the number of nodes:");
		numberofnodes = 9;//System.in.read();
		
		//System.out.println("please enter the node to kill:");
		nodetokill = 5;//System.in.read();
		
		//create singly linked lis8t
		
		Node current = first;
		for (int i = 2 ; i <= numberofnodes; i++)
		{
			 current.setNext(new Node(i, null));
			 current = current.getNext();
		}
		//make the linked list circular
	     current.setNext(first);
	     
	     //now start the killing
	     current = first;
	     while(current.getNext() != current)
	     {
	    	 for(int x =1; x <nodetokill-1; x++)
	    	 {
	    		 
	    		 current = current.getNext();
	    		 
	    	 }
	    	 System.out.println("the node to die is " + current.getNext().getKey() );
	    	 current.setNext(current.getNext().getNext())	  ;   
	   }
	     
	     
	}
	
	

}
