import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Date
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Please Enter the Date, Month & Year");

System.out.println("Please Enter the Date");
int day = sc.nextInt();
System.out.println("Please Enter the Month");
int month = sc.nextInt();
System.out.println("Please Enter the Year");
int year = sc.nextInt();

System.out.println("Please Enter Time");
System.out.print("Hour");
int hour = sc.nextInt();
System.out.println("Minute");
int min = sc.nextInt();
System.out.println("Second");
int second = sc.nextInt();

LocalDateTime time = LocalDateTime.of(year,month,day,hour,min,second);
DateTimeFormatter dtf1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
DateTimeFormatter dtf3 =  DateTimeFormatter.ofPattern("yyyy/MM/dd");

DateTimeFormatter dtf4 =  DateTimeFormatter.ofPattern("hh:mm:ss");
DateTimeFormatter dtf5 =  DateTimeFormatter.ofPattern("hh:mm:ss a");
DateTimeFormatter dtf6 =  DateTimeFormatter.ofPattern("hh:mm ");

System.out.println("Date Format ");
System.out.println("dd/mm/yyyy ---->"+dtf1.format(time));
System.out.println("mm/dd/yyyy ---->"+dtf2.format(time));
System.out.println("yyyy/mm/dd ---->"+dtf3.format(time));

System.out.println();

System.out.println("Time Format ");
System.out.println("hh:mm:ss ----> "+dtf4.format(time));
System.out.println("mm:hh:ss ----> "+dtf5.format(time));
System.out.println("hh:mm ----> "+dtf6.format(time));

System.out.println();

System.out.println("Time Date Format ");
System.out.println("dd/mm/yyyy ----> "+dtf1.format(time)+" "+dtf4.format(time));
System.out.println("mm/dd/yyyy ----> "+dtf2.format(time)+" "+dtf5.format(time));
System.out.println("yyyy/mm/dd ----> "+dtf3.format(time)+" "+dtf6.format(time));
}
}
