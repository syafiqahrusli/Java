package com.piqah.sample;

//import java.util.*;

public class UtilCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Non Generic
		/*
		List list = new ArrayList();
		
		list.add("hello"); */
		
		// Generic
		
		List<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("I");
		list.add("am");
		list.add("Java");
		list.add("ArrayList");
		
		//String s =  list.get(10);
		/*
		for(String s : list) {
		
		System.out.print(s + " "); */
		
		/*
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " "); */
		
		for(Iterator<?> it = list.iterator();it.hasNext();) {
			String s = (String) it.next();
			if(s.equals("hello"))
				System.out.println("I got :" + s);
			
		
		}

	}

}
