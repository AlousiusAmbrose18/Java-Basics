package com.alo.Collections;

class Node1 {
	Object e;
	Node1 next;

	public Node1(Object e, Node1 next) {

		this.e = e;
		this.next = next;
	}

}

class LinkList {

	private Node1 head;
	private int size;

	public LinkList() {
		head = null;
		size = 0;

	}

	public void add(Object e) {

		if (head == null) {
			head = new Node1(e, null);
			size++;
			return;
		}

		Node1 temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = new Node1(e, null);
		size++;

	}

	public void getAll() {
		Node1 temp = head;

		while (temp.next != null) {
			System.out.print(temp.e + " ");

			temp = temp.next;
		}
		System.out.print(temp.e + " ");
	}

	public int size() {
		return size;
	}

	public Object get(int index) {

		Node1 temp = head;

		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.e;
	}

	public void add(int index, Object e) {
		

		if(index<0 || index >=size()) throw new IndexOutOfBoundsException();
		Node1 temp =head;
		
		if(index==0) {
			head = new Node1(e,head); return;
		}
			
		
		for(int i=1; i<index; i++)
		{
			temp = temp.next;
		}
		Node1 prev = temp.next;
		temp.next = new Node1(e,prev);
		
		size++;
		
	}
	
	
	public Object remove(int index)
	{
		Node1 temp = head;
		
		for(int i=1; i<index;i++) {
			temp =temp.next;
		}
		Object rm = temp.next.e;
		
		temp.next = temp.next.next;
		size--;
		return rm;
		
	}
	
	

}

public class MyLinkedListTest {

	public static void main(String[] args) {

		LinkList l = new LinkList();

		l.add(20);
		l.add(70);
		l.add(30);
		l.add(50);
		l.add(60);

		l.add(2, 40);
		l.add(0, 10);
		//System.out.println();

		System.out.println(l.get(2));

		System.out.println(l.size());
			
		l.getAll();
		
		System.out.println();
		
		System.out.println(l.remove(2));
		
		System.out.println(l.size());
		
		l.getAll();

	}

}
