package com.training.linkedlist;

public class LinkedList<K> {

	private Node<K> head = null;
	private Node<K> forward = null;

	public void printLinkedList(Node<K> node) {
		while (node != null) {
			System.out.print(node.getKey() + "-->");
			node = node.getNext();
		}
	}

	/**
	 * To add new node to the linked list
	 */
	public void addFront(K key) {
		Node<K> newNode = new Node<K>(key);
		if (head == null) {
			head = newNode;
		}

		else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	/**
	 * to find the length of the linked list and return an integer value
	 */
	public int length(Node<K> node) {
		int len = 0;
		while (node.getNext() == null) {
			len++;
			node = node.getNext();
		}
		return len;
	}

	/**
	 * To add new node to the linked list in between two nodes
	 */
	public void addMiddle(K key) {
		Node<K> newNode = new Node<K>(key);
		if (head == null) {
			head = newNode;
			forward = newNode;
		}

		else {
			Node<K> temp = head;
			int len = length(head);
			if (len % 2 == 0)
				len--;
			len /= 2;
			while (len > 0) {
				temp = temp.getNext();
				len--;
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
	}

	/**
	 * To add new node to the linked list
	 */
	public void addLast(K key) {
		Node<K> newNode = new Node<K>(key);
		if (head == null) {
			head = newNode;
			forward = newNode;
		}

		else {
			forward.setNext(newNode);
			forward = newNode;
		}
	}

	/**
	 * Deleting the node at the starting position
	 */
	public void deleteNodeAtStart() {
		if (head == null)
			return;
		head = head.getNext();
	}
	
	/**
	 * Deleting the last node from the linked list
	 */
	public void deleteNodeAtLast()
	{
		if(head == null) //if the list is empty
			return;
		Node<K> node = head.getNext();
		Node<K> temp = head;
		while(node.getNext()!=null)
		{
			temp = temp.getNext();
			node = node.getNext();
		}
		temp.setNext(null);
	}
	
	/*
	 * to search for the specific key in the linked list
	 */
	public boolean findKey(K key)
	{
		Node<K> node = head;
		while(node.getNext()!=null)
		{
			if(node.getKey() == key) 
				return true;
			node = node.getNext();
		}
		return false;
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.addFront(70);
		list.addFront(30);
		list.addFront(56);
		boolean result = list.findKey(50);
		System.out.println(result);
		list.printLinkedList(list.head);
	}

}
