package com.piqah.sample;

public class TestSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleA obj1 = new SampleA();
		SampleB obj2 = new SampleB();
		
		System.out.println("About to print objects..");
		System.out.println(obj1);
		System.out.println(obj2);
		
		String strObjName = new String (obj1.toString());
		System.out.println("strObjName : " + strObjName );
		
		
		if(strObjName.equalsIgnoreCase("Sample A")){
			
			System.out.println("This is Sample A");
					
		} else {
			System.out.println("This is not Sample A");
			
		}

	}

}
