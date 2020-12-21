import java.util.*;
public class linkedlist {
 Node head;
	
	 class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	  }
	
	public void push(int ndata)
	{
		Node Nnode=new Node(ndata);
		
		Nnode.next=head;
		head=Nnode;	
	}
	
	public void insrt(Node prev,int newdata)
	{
		
		if(prev==null)
		{
		 System.out.println("linked list null");
			return;
		}
		
		Node nnode=new Node(newdata);
		
		nnode.next=prev.next;
		prev.next=nnode;	
		
	}
	public void append(int data)
	{
	   Node nnode=new Node(data);
		
		if(head==null)
		{
			head=new Node(data);
			return;
		}
		
		
		nnode.next=null;
		
		Node last=head;
		
		while(last.next!=null)
			last=last.next;
		
		
		last.next=nnode;
		return;
		
	}
	public void del(int key)
	{
		Node temp=head,prev=null;
		
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		
		if(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;
	}
	
	
	
	public void printList() 
	    { 
	        Node tnode = head;
	        
	        while(tnode!=null)
	        {
	        	System.out.println(tnode.data+"");
	        	tnode=tnode.next;
	        }
        } 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		Scanner sc=new Scanner(System.in);
		linkedlist ls=new linkedlist();
		System.out.println("switch");
		c=sc.nextInt();
		switch(c)
		{
		case'1':
			System.out.println("inserted a element at sqences");
			int a=sc.nextInt();
			while(a!='0')
			{
				ls.push(a);
			}
			
		}
		
		ls.append(6);
		ls.push(7);
		ls.push(1);
		ls.append(4);
		ls.insrt(ls.head.next, 8);
		ls.del(7);
		
		System.out.println("linked list");
		ls.printList();

	}

}
