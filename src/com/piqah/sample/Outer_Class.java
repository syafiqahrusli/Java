package com.piqah.sample;

public class Outer_Class {
	
	int num;
	
	//inner class
	private class Inner_Class{
		public void print (){
			System.out.println("This is an inner class");
		}
		
	}
		
		//public inner class
		public class Inner_Class2{
			public void print (){
				System.out.println("This is an inner class 2");
			}
	
		}
		
		void myMethod(){
		//public inner class
		class Inner_Class3{
				public void print (){
				System.out.println("This is an inner class 3 inside myMethod");
	    }	 
				// end of class
				
				Inner_Class3 inner = new Inner_Class3();
				inner.print();
				
			
        }
		}
		
	//Acessing the inner class from the method within 
	void display_Inner(){
		Inner_Class inner = new Inner_Class();
		inner.print();
	}

}
