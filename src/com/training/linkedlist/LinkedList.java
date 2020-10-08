package com.training.linkedlist;

public class LinkedList<K> {

	private Node<K> head = null;
	private Node<K> forward = null;

	public void printLinkedList(Node<K> node) {
		while (node != null) {
			System.out.print(node.getKey() + "-->");
			node = node.getNext();
		}
		System.out.println();
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
	public void deleteNodeAtLast() {
		if (head == null) // if the list is empty
			return;
		Node<K> node = head.getNext();
		Node<K> temp = head;
		while (node.getNext() != null) {
			temp = temp.getNext();
			node = node.getNext();
		}
		temp.setNext(null);
	}

	/*
	 * to search for the specific key in the linked list
	 */
	public boolean findKey(K key) {
		Node<K> node = head;
		while (node.getNext() != null) {
			if (node.getKey() == key)
				return true;
			node = node.getNext();
		}
		return false;
	}

	/**
	 * inserting node at specified target position
	 */
	public boolean addValueAtTargetPosition(K target, K value) {
		int flag = 0;
		Node<K> temp = head;
		Node<K> tmp = temp.getNext();
		Node<K> newNode = new Node<>(value);
		if (head == null)
			return false;
		while (temp.getKey() == target || temp.getNext() != null) {
			if (temp.getKey() == target) {
				tmp = temp.getNext();
				flag = 1;
				break;
			}
			temp = temp.getNext();

		}
		if (flag == 1) {
			temp.setNext(newNode);
			newNode.setNext(tmp);
			return true;
		} else
			return false;

	}

	/**
	 * deleting the target node from the linked list
	 */
	public void deleteTargetNode(K target) {
		int flag = 0;
		Node<K> temp = head;
		if (head == null)
			return;
		if (head.getKey() == target) {
			head = head.getNext();
			flag = 1;
		}
		while (temp.getNext() != null || temp.getNext().getKey() != target) {
			if (temp.getNext().getKey() == target) {
				flag = 1;
				temp.setNext(temp.getNext().getNext());
				break;
			}
			temp = temp.getNext();
			if (temp.getNext() == null)
				break;
		}
		if (flag == 0)
			System.out.println("Target Node didn't found");
		else {
			System.out.println("Node deleted");
		}
	}

	public void addNodeInSorted(K value) {
		Node<K> temp = head;
		Node<K> newNode = new Node<>(value);
		if (head == null)
			head = newNode;
		else if ((int) newNode.getKey() < (int) head.getKey()) {
			newNode.setNext(head);
			head = newNode;
		} else {
			while (temp.getNext() != null && (int) temp.getNext().getKey() < (int) newNode.getKey()) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.addNodeInSorted(70);
		list.addNodeInSorted(30);
		list.addNodeInSorted(56);
		list.addNodeInSorted(35);
		list.addNodeInSorted(100);
		list.printLinkedList(list.head);
	}

}
