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

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.printLinkedList(list.head);
	}

}
