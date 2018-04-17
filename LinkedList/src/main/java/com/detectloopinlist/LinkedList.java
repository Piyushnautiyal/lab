package com.detectloopinlist;

import java.util.HashSet;


class LinkedList
{
	static Node head;  // head of list

	/* Linked list Node*/
	static class Node
	{
		int data;
		Node next;

		// Constructor to create a new node
		// Next is by default initialized
		// as null
		Node(int d) {data = d; next=null;}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
	public  void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+"-->");
			n = n.next;
		}
		System.out.println("NULL");
	}
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
                  Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;
		/* 4. Move the head to point to new Node */
		head = new_node;
	}
	public static  boolean detectLoop(Node h)
	{
		HashSet<Node> s = new HashSet<Node>();
		while(h!=null)
		{
			if(s.contains(h))
			{
				return true;
			//	return h.data;
			}
			s.add(h);
			h = h.next;
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		LinkedList llist = new LinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		llist.printList();
		/*Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");
		//System.out.println("LOOP FOUND CHECK RESULT "+detectLoop(head));

	}
}
