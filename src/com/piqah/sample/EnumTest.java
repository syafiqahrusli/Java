package com.piqah.sample;

public class EnumTest {
	
	Day day;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	public EnumTestDay(Day day){ this.day = day }
	
	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println(" Monday are bad.");
			break;
			
		case FRIDAY:
			System.out.println(" Friday are better.");
			break;
			
		case SATURDAY:	
		
			
		case SUNDAY:
			System.out.println(" Weekend are best");
			break;
			
			
			default;
			System.out.println(" Midweek days are so so");
			break;
			
		}

	}
	
	public static void main (String [] args){
		
		EnumTest firstDay = new EnumTest (Day.MONDAY);
		firstDay.tellItLikeItIs();
		
		EnumTest thirdDay = new EnumTest (Day.WEDNESDAY);
		firstDay.tellItLikeItIs();
		EnumTest firstDay = new EnumTest (Day.THURSDAY);
		firstDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest (Day.FRIDAY);
		firstDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest (Day.SATURDAY);
		firstDay.tellItLikeItIs();
		EnumTest firstDay = new EnumTest (Day.SUNDAY);
		firstDay.tellItLikeItIs();
		
	}

}
