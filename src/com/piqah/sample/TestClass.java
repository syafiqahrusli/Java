package com.piqah.sample;

public class TestClass implements inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "testtttt";
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		
		System.out.println("Test it!");

	}
	
	public static void main (String args[]){
		
		System.out.println("Inside Test Class main");
		System.out.println(name);
		//name = "New name"
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(inf2.name);
		
		inf1 obj = new TestClass();
		System.out.println(obj.whoAmI());

		
		
		
	}

}
