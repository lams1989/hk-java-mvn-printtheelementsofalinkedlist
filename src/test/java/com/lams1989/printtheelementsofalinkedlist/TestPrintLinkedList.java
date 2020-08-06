package com.lams1989.printtheelementsofalinkedlist;

import com.lams1989.printtheelementsofalinkedlist.PrintLinkedList.SinglyLinkedList;

import junit.framework.TestCase;

public class TestPrintLinkedList extends TestCase {

	static void testPrintLinkedList() {
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.insertNode(0);
		llist.insertNode(13);
		llist.insertNode(13);
		llist.insertNode(123);
		llist.insertNode(23);
		
		PrintLinkedList.printLinkedList(llist.head);
	}
}
