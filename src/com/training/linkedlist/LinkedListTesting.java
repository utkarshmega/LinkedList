package com.training.linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTesting {
	private LinkedList<Integer> obj = new LinkedList<>();
	
	@Before
	public void initialise()
	{
		obj.addFront(70);
		obj.addFront(30);
		obj.addFront(56);		
	}

	@Test
	public void test() {
		boolean result = obj.findKey(30);
		Assert.assertTrue(result);
	}

}
