package com.training.linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTesting {

	@Test
	public void test() {
		LinkedList<Integer> obj = new LinkedList<>();
		boolean result = obj.findKey(30);
		System.out.println(result);
		Assert.assertTrue(result);
	}

}
