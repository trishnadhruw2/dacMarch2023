import java.util.Scanner;
class TelephoneBillCalculation {
    private String customerName;
    private long phoneNumber;
    private int numberOfCallMade;
    private double durationOfCalls;
void getRecord(String customerName,long phoneNumber, int numberOfCallMade, double durationOfCalls) {
    this.customerName = customerName;
    this.phoneNumber = phoneNumber;
    this.numberOfCallMade = numberOfCallMade;
    this.durationOfCalls = durationOfCalls;
}
void setCalculateBill( ) {
    if(this.numberOfCallMade<=100) System.out.println("Telephone Bill Amount : "+((this.numberOfCallMade * 0.50)+10));
    else System.out.println("Telephone Bill Amount : "+((this.numberOfCallMade * 0.25) +10));
}
public void setdurationOfCall(double durationOfCalls ) {
    if(this.durationOfCalls<1)  
        this.durationOfCalls = 1;
      
}
public double getdurationOfCall( ) {
    return this.durationOfCalls;
    }
}

class Program {
    public static void main(String[] args) {
        TelephoneBillCalculation bill = new TelephoneBillCalculation();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer name : ");
        String customerName = sc.nextLine();
        System.out.println("Enter the Phone number : ");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the  Number of call made : ");
        int numberOfCallMade = sc.nextInt();
        System.out.println("Enter the Duration of calls (in minutes) : ");
        double durationOfCalls = sc.nextDouble();
        bill.getRecord( customerName, phoneNumber, numberOfCallMade, durationOfCalls);
        bill.setdurationOfCall(durationOfCalls);
        System.out.println("Duration of calls :"+bill.getdurationOfCall( ));
        bill.setCalculateBill();
    }
    
}