package ReverseLinkedList;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol = new Solution();
		ListNode l1 = new ListNode(0);
		
		ListNode head = l1;
		
		
		
		for(int i = 0 ; i <11 ; i++)
		{
			//System.out.println(head.val);
			head.next = new ListNode(i+1);
			head = head.next;
		}
		
		System.out.println("now printing head");
		
		
		
		ListNode last = sol.reverseList(l1);
		
		for(int i = 0 ; i <11 ; i++)
		{
			System.out.println(last.val);
			last = last.next;
		}
		
	
		

	}

}
