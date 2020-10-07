package com.training.linkedlist;

public class myNode<K> {
	private K key;
	private myNode next;

	myNode(K key) {
		this.key = null;
		this.next = null;
	}

	public myNode getNext() {
		return next;
	}

	public void setNext(myNode address) {
		this.next = address;
	}

}
