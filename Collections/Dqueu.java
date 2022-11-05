package com.alo.Collections;

import java.util.ArrayDeque;
import java.util.Objects;

public class Dqueu {

	public static void main(String[] args) {
		
		ArrayDeque<Object> dequeue = new ArrayDeque<Object>();
		
		dequeue.addFirst("hiii");
		dequeue.addLast("hello");
		dequeue.add("alousi");
		dequeue.addLast("bye");
		
		System.out.println(dequeue);
		System.out.println(dequeue.removeLast());
		
		System.out.println(dequeue);
		System.out.println(dequeue.removeLast());
		
		System.out.println(dequeue);
		System.out.println(dequeue.removeLast());
		
		System.out.println(dequeue);
		System.out.println(dequeue.removeLast());	

	}

}
