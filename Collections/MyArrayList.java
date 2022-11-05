package com.alo.Collections;

import java.util.Collection;

class MyArrayListTest {
	
	Object [] a;
	
	int p;

	public MyArrayListTest() {
		
		a = new Object[10];
		p=0;
	}
	
	public void add(Object e) {
		
		if(p>=a.length) grow();

		a[p++]=e;
	}

	private void grow() {
		
		Object[] temp =new Object[((a.length*3/2)+1)];
		
		for(int i=0; i< a.length;i++)
		{
			temp[i] = a[i];
		}
		
		a = temp; p++;
		
	}
	
	public int size()
	{
		return p;
		
	}
	
	public Object get(int index)
	{
		if(index<0 || size()<=index)  throw new IndexOutOfBoundsException(); 
		
		return a[index];
	}

	public Object remove(int index)
	{	
		Object temp=a[index];
		
		for(int i=index; i<size();i++) {
			
			a[i]=a[i+1];
		}
		p--;
		a[p]=null;
			
		return temp;
	}
	
	public void add(int index, Object e)
	{
		if(index<0 || index>=size()-1) throw new IndexOutOfBoundsException();
		
		if(p>a.length) grow();
		
		for(int i=size()-1; i>=index; i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	
	public void clear()
	{
		a = new Object[10];
		p=0;
	}
	
}





public class MyArrayList
{
	public static void main(String[] args) {
		
		MyArrayListTest l = new MyArrayListTest();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		for(int i=0;i< l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		System.out.println("GetIndex : "+l.get(2));
		
		System.out.println("Removed : "+l.remove(3));
		
		for(int i=0;i< l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		System.out.println("Size of Array : "+l.size());
		
		l.clear();
		
		System.out.println("Size of Array : "+l.size());
		
	
	}
}







