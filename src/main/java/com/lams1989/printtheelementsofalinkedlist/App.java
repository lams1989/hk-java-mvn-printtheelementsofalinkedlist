package com.lams1989.printtheelementsofalinkedlist;

import com.lams1989.printtheelementsofalinkedlist.PrintLinkedList.SinglyLinkedList;

public class App 
{
    public static void main( String[] args ){
    	SinglyLinkedList llist = new SinglyLinkedList();
    	llist.insertNode(0);
		llist.insertNode(13);
		llist.insertNode(13);
		llist.insertNode(123);
		llist.insertNode(23);
		PrintLinkedList.printLinkedList(llist.head);
	
    }
}
