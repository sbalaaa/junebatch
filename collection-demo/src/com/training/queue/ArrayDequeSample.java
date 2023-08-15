package com.training.queue;

import java.util.ArrayDeque;

public class ArrayDequeSample {

	public ArrayDequeSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ArrayDeque<String> dequeList = new ArrayDeque<String>();
		dequeList.add("B");
		System.out.println("Values In the Deque : " + dequeList);
		dequeList.addFirst("A");
		dequeList.addLast("C");
		System.out.println("Values In the Deque after adding A first and C last : " + dequeList);
		dequeList.pollLast();
		System.out.println("Values In the Deque after removing last element: " + dequeList);

	}

}
