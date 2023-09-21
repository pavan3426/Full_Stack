package oe;
public class OrderEntry
{
	public static void main(String args[])
	{
	
	float rentalItem1 ;
	float rentalItem2 ;
	
	rentalItem1 = 2.95f;
	rentalItem2 = 3.50f;
	
	System.out.println("Rental item 1 cost is: "+rentalItem1);
	System.out.println("Rental item 2 cost is: "+rentalItem2);
	
	double itemTotal;
	int line =1, numOfDays =2;
	itemTotal = ((rentalItem1 * numOfDays) + ( rentalItem1 * numOfDays));  
	System.out.println("total cost : " +itemTotal);
	
	
	System.out.println( "Item" + line++ +"is  "+ rentalItem1 + " * "+ numOfDays+" days = "+ (rentalItem1*numOfDays));
	
	System.out.println( "Item" + line++ +"is  " +rentalItem2 + " * "+ numOfDays+" days = "+ (rentalItem2*numOfDays));
	
	int day =25 , month=5, year=2000;
	System.out.println(day + "/" + month + "/" + year);
	
	int daysInMonth;
	
	switch(month){
		case 1: daysInMonth =31;
		break;
		case 2: daysInMonth =28;
		break;
		case 3: daysInMonth =31;
		break;
		case 4: daysInMonth =30;
		break;
		case 5: daysInMonth =31;
		break;
		case 6: daysInMonth =30;
		break;
		case 7: daysInMonth =31;
		break;
		case 8: daysInMonth =31;
		break;
		case 9: daysInMonth =30;
		break;
		case 10: daysInMonth =31;
		break;
		case 11: daysInMonth =30;
		break;
		default: daysInMonth =31;
		break;
		
	}
	System.out.println(daysInMonth +" days in month");
	
	System.out.println(day + "/" + month + "/" + year);
	System.out.println(daysInMonth +" days in month");
	
	System.out.println("Printing all days to end of month using for loop...");
	for(int i= day; i<=daysInMonth; i++)
	{
		
		System.out.println(i + "/" + month + "/" + year);
	}
	day=30;
	
	for(int i= day; i<=daysInMonth; i++)
	{
		
		System.out.println(i + "/" + month + "/" + year);
	}
	
	boolean isLeapYear = (year%4 ==0) && (year%100!=0) || (year%400 ==0);
	
		switch(month){
		case 1: daysInMonth =31;
		break;
		
		case 2:


			if(isLeapYear){
					daysInMonth =29;
					break;
			}
			else{
				daysInMonth =28;
				break;
			}
				
		
		case 3: daysInMonth =31;
		break;
		case 4: daysInMonth =30;
		break;
		case 5: daysInMonth =31;
		break;
		case 6: daysInMonth =30;
		break;
		case 7: daysInMonth =31;
		break;
		case 8: daysInMonth =31;
		break;
		case 9: daysInMonth =30;
		break;
		case 10: daysInMonth =31;
		break;
		case 11: daysInMonth =30;
		break;
		default: daysInMonth =31;
		break;
		
	}
	
	year=1996;
	
	boolean isLeapYear2 = (year%4 ==0) && (year%100!=0) || (year%400 ==0);
	
		switch(month){
		case 1: daysInMonth =31;
		break;
		
		case 2:


			if(isLeapYear2){
					daysInMonth =29;
					break;
			}
			else{
				daysInMonth =28;
				break;
			}
				
		
		case 3: daysInMonth =31;
		break;
		case 4: daysInMonth =30;
		break;
		case 5: daysInMonth =31;
		break;
		case 6: daysInMonth =30;
		break;
		case 7: daysInMonth =31;
		break;
		case 8: daysInMonth =31;
		break;
		case 9: daysInMonth =30;
		break;
		case 10: daysInMonth =31;
		break;
		case 11: daysInMonth =30;
		break;
		default: daysInMonth =31;
		break;
		
	}
	
	int dueDay, dueMonth, dueYear;
	
	int rentDays = 3;
	dueDay = day+rentDays;
	dueMonth=month;
	dueYear=year;
	
	if(dueDay<=daysInMonth)
	{
		System.out.println(dueDay+"/"+ dueMonth+"/"+dueYear );
	}
	
	else{
		dueDay= (dueDay -day);
		dueMonth = month + 1;
		if(month > 12 )
		{
			dueYear=year +1;
		}
	}
	
	System.out.println( "Rental date : " + day+ "/" + month+ "/" + year);
	System.out.println("Number of rental days :"+rentDays);
	System.out.println("Date Due: " + dueDay+"/"+ dueMonth+"/"+ dueYear); 
	
	if((month>0) && (month<13)){
		System.out.println(month+ " is a valid month");
	}
	else{
		System.out.println(month+ " is not a valid month");
	}
		
	
	
	
}


}
