import java.util.Scanner;
class Date9{
int day;
int month;
int year;
 Scanner sc= new Scanner(System.in);
Date9(int day,int month,int year){
this.day=day;
this.month=month;
this.year=year;
}
public void showMenu(){
System.out.println("1.to check validity");
System.out.println("2.to get day of week");
System.out.println("3.to check is leap year or not");
System.out.println("4.to get next day");
System.out.println("5.to get previous day");
System.out.println("exit");
}
public void dayOfWeek(int w){
	int c = w;
	switch (c){
		case 1:System.out.println("Monday");
		 break;
		 case 2:System.out.println("Tuesday");
		 break;
		 case 3:System.out.println("Wednesday");
		 break;
		 case 4:System.out.println("Thursday");
		 break;
		 case 5:System.out.println("Friday");
		 break;
		 case 6:System.out.println("Saturday");
		 break;
		 case 0:System.out.println("Sunday");
		 break;
	}
}
public void isLeapYear(){
	if(this.year%4==0 && this.year%100!=0)
	{System.out.println("its new year");
	}
	else if (this.year%400==0)
	{System.out.println("its new year");
	}
	else 
	System.out.println("not a new year");
}
public void setNextDay(){
	this.day = (this.day + 1);
}
public int getNextDay(){
return this.day;
}
	
public void setPreviousDay(){
	this.day = (this.day - 1);
}
public int getPreviousDay(){
return this.day;
}
		
	
public static void main(String args[]){
Date9 date = new Date9(03,10,2000);
date.showMenu();
 Scanner sc= new Scanner(System.in);
int choice = sc.nextInt();
switch (choice){
	//case 1:date.isValid();
	      //  break;
    case 2:date.dayOfWeek(5);
	        //break;
	case 3:date.isLeapYear();
	        //break;
    case 4:date.setNextDay();
	        System.out.println(date.getNextDay());
	       //break;
    case 5:date.setPreviousDay();
	        System.out.println(date.getPreviousDay());
	       //break;
    case 6: break;
}

}
} 
