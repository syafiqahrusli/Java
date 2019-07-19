package com.piqah.sample;

public class ThreadTest extends Thread {
	
	
	@Override
	public void run(){
		//try{
		System.out.println("I am a new Thread running" );
		Thread.sleep(1000);
		
		
		//} catch(InterruptException ex){
		//	ex.printStackTrace();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		ThreadTest t3 = new ThreadTest();
		ThreadTest t4 = new ThreadTest();
		ThreadTest t5 = new ThreadTest();
		
		t1.start();
		set
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
