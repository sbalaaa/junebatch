package com.training.queue;

import java.util.LinkedList;

public class LinkedListQueue {

	public LinkedListQueue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedList<String> strList = new LinkedList<String>();
		System.out.println(strList.peek()); // return null if element does not exist
		//System.out.println(strList.element()); // Throws exception(java.util.NoSuchElementException) if element does not exist
		System.out.println(strList.poll()); // return null if element does not exist
		//System.out.println(strList.remove()); // Throws exception(java.util.NoSuchElementException) if element does not exist
		strList.offer("Java");
		strList.add("Welcome"); // May throws Exceptions for capacity-restricted Queue implementations
		System.out.println(strList);
		

	}

}
