package com.piqah.sample;

public class FinalRunner{

	public static void main(String [] args){
		
		FinalClass.sayHi("Java");
		
		FinalClass obj = new FinalClass();
		FinalClass obj2 = new FinalClass();
		
		obj.sayHi("Java");
		obj.sayBye("Java");
		System.out.println(obj.className);
		System.out.println(obj.className2);
		
		obj2.sayHi("Java");
		obj2.sayBye("Java");
		System.out.println(obj2.className);
		System.out.println(obj2.className2);
		
		obj.className = "MyClass1";
		obj.className2 = "MyClass1";
		
		obj2.className = "MyClass1";
		obj2.className2 = "MyClass1";
		
		System.out.println("Modified 1 : " + obj.className);
		System.out.println("Modified 1 : " + obj.className2);
		
		System.out.println("Modified 1 : " +  obj2.className);
		System.out.println("Modified 1 : " +  obj2.className2);
		
		
		
		
		
	}
}
