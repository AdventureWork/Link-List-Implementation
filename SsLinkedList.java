
import java.util.Scanner;

public class SsLinkedList 
{
	public static void main(String[] args) 
	{
		        LinkedList2 lList = new LinkedList2();
		        Scanner sc=new Scanner(System.in);
		        // add elements to LinkedList
		        int choice=0,d=0;
		        do
		        {
		        	System.out.println("***Menu***");
		        	System.out.println("1.Add to list");
		        	System.out.println("2.Display list");
		        	System.out.println("3.Exit");
		        	System.out.println("Enter your choice:");
		        	choice=sc.nextInt();
		        	switch(choice)
		        	{
		        	case 1:
		        		System.out.println("enter value to be inserted");
		        		d=sc.nextInt();
		        		lList.add(d);
			        break;
		        	case 2:

				        System.out.println("linkedlist: " + lList);
				        break;
		        	}
		        }while(choice!=3);
		    }
}
		 
class LinkedList2 
{
		    // reference to the head node.
		    private Node head;
		    private int listCount;
		 
		    // LinkedList constructor
		    public LinkedList2() {
		        // this is an empty list, so the reference to the head node is set to a new node with no data
		        head = new Node(null);
		        listCount = 0;
		    }
		 
		    public void add(Object data)
		    // appends the specified element to the end of this list.
		    {
		        Node Temp = new Node(data);
		        Node Current = head;
		        // starting at the head node, crawl to the end of the list
		        while (Current.getNext() != null) {
		            Current = Current.getNext();
		        }
		        // the last node's "next" reference set to our new node
		        Current.setNext(Temp);
		        listCount++;// increment the number of elements variable
		    }
		 
		    public String toString() {
		        Node Current = head.getNext();
		        String output = "";
		        while (Current != null) {
		            output += "[" + Current.getData().toString() + "]";
		            Current = Current.getNext();
		        }
		        return output;
		    }
		 
		    private class Node 
		    {
		        // reference to the next node in the chain, or null if there isn't one.
		        Node next;
		        // data carried by this node.could be of any type you need.
		        Object data;
		 
		        // Node constructor
		        public Node(Object dataValue) 
		        {
		            next = null;
		            data = dataValue;
		        }
		 
		        public Object getData() 
		        {
		            return data;
		        }
		 
		        public Node getNext() 
		        {
		            return next;
		        }
		 
		        public void setNext(Node nextValue) 
		        {
		            next = nextValue;
		        }
		    }
		}
