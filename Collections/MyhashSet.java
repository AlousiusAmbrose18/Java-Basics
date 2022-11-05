package com.alo.Collections;

class Node
{
	Object key;
	Node next;
	
	public Node (Object k, Node n)
	{
		this.key =k;
		this.next=n;
	}
	
}

class MylinkedHashset
{
	 Node a[] = new Node[5];	
	
	public boolean add(Object e)
	{
		int index =e.hashCode()% a.length;
		
		if(a[index]==null)
		{
			a[index]= new Node(e,null);
			return true;
		}
		Node curr =a[index];
		Node prev = null;
		
		while(curr!= null)
		{
			if(curr.key.equals(e)) return false;
			prev =curr;
			curr=curr.next;
		}
		
		prev.next =new Node(e,null);
		
		return true;
	}
	
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node curr = a[i];
			
			while(curr!=null)
			{
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
	
	
	
}





public class MyhashSet {

	public static void main(String[] args) {
		
		MylinkedHashset m =new MylinkedHashset();
		
		
		System.out.println(m.add(10));
		System.out.println(m.add(20));
		System.out.println(m.add(30));
		System.out.println(m.add(10));
		System.out.println(m.add(20));
		
		m.display();

	}

}
