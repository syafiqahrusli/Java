package com.piqah.sample;

public class My_Class {

	public void displayMessage(Message m){
		System.out.println(m.greet());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanting the outer class
		Outer_Class outer = new Outer_Class();
		outer.display_Inner();
		
		outer.myMethod();
		
		Outer_Class.Inner_Class2 inner = outer.new Inner_Class2();
		inner.print();
		
		My_Class obj = new My_Class();
		obj.displayMessage(new Message() { 
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hi";
			}
		});

	}

}
