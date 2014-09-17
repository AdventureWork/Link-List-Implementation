package LL;

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
		    
		    private Node head;
		    private int listCount;
		 
		    
		    public LinkedList2() {
		    
		        head = new Node(null);
		        listCount = 0;
		    }
		 
		    public void add(Object data)
		    
		    {
		        Node Temp = new Node(data);
		        Node Current = head;
		        
		        while (Current.getNext() != null) {
		            Current = Current.getNext();
		        }
		        
		        Current.setNext(Temp);
		        listCount++;
		    }
		 
		    public void add(Object data, int index)
		    
		    {
		        Node Temp = new Node(data);
		        Node Current = head;
		      
		        for (int i = 1; i < index && Current.getNext() != null; i++) {
		            Current = Current.getNext();
		        }
		        
		        
		 	Temp.setNext(Current.getNext());
		        
		        Current.setNext(Temp);
		        listCount++;
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
		        Node next;
		        Object data;
	
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
