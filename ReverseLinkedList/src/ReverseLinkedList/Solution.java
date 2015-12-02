package ReverseLinkedList;

import java.util.ArrayList;

import java.util.List;


/**
 * @author mohamed
 *
 */
/**
 * @author mohamed
 *
 */
class Solution {

	
    public ListNode reverseList(ListNode head) {
    	
    	  ListNode previous = null,next = null,current = head;
    	  ListNode first = head;
    	  current = head;
    	    	  
    	  while (current !=null)
    	  {    		  
    		  	next  = current.next;  
    	        current.next = previous;   
    	        previous = current;
    	        current = next;
    	    		  
    	  }
    	  
    	  return previous;
    }


    
    public ListNode removeElements(ListNode head, int deletevalue) {
    	
    	ListNode current = head;
    	ListNode previous = null,next = null;
    	
    	while (current != null){
    		
    		next = current.next;
    		if (current.val == deletevalue && previous !=null)
    		{
    			previous.next = next;
    		}else if(previous == null)
    		{
    			head = next;
    		}
    		
    		previous = current;
    		current = next;
    	}
    	
    	return head;
        
    }
    





}