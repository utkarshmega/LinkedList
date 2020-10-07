package com.training.linkedlist;

public class Node<K> {
	private K key;
	private Node<K> next;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public Node<K> getNext() {
		return next;
	}

	public void setNext(Node<K> next) {
		this.next = next;
	}
	
	public K getKey() {
		return key;
	}
   
}
