package com.training.linkedlist;

public class Node<K> {
	private K key;
	private Node<K> next;

	public Node(K key) {
		this.key = null;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
