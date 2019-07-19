package com.piqah.sample;

public class TernaryOperator{

	public static void main(String [] args){
		
	   String strInput = " ";
		
		try {
		
		strInput = args[0];
		
		System.out.println(strInput instanceof String);

		int input = Integer.parseInt(strInput);
		int target = 0;

		/*if(input > 10){
			target = 10;

		
		else {
			target=input;
		} */

		target = (input >10)? 10:input; 

		outer: for(int i=0; i<10; i++){

			for(int j=0;j<10; j++){
				if (j>i){

					System.out.println();
					continue outer;
				}
				System.out.print(" " + (i + j));

			}
		}

         System.out.println();    
	}  catch(Exception ex){
		System.out.println("I guess you didn't give me number : ");
		System.out.println()
	}

}