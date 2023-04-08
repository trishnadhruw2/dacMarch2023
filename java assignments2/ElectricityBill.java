import java.util.Scanner;
public class ElectricityBill {
    
    String customerName ;
    double unitsConsumed ;
    double billAmount ;

    ElectricityBill(){
        
    }

    ElectricityBill(String customerName, double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBillAmount(){
        double unit;
        if(this.unitsConsumed>0){
            if(this.unitsConsumed<=100){
                this.billAmount=this.unitsConsumed*5;
            }
            if(this.unitsConsumed>100){
                
                if(this.unitsConsumed<=200){
                    unit=this.unitsConsumed-100;
                    this.billAmount=(unit*7)+500;
                }
                if(this.unitsConsumed>200){
                    unit = this.unitsConsumed-200;
                    this.billAmount=(unit*10)+700+500;
                }
                
            }
        }
        System.out.println("Customer Name : " + this.customerName + "\n"+
                            "Units Consumed : " + this.unitsConsumed +"\n"+
                            "Bill Amount : "+ this.billAmount );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cutomer name : ");
        String customerName = sc.next();
        
        System.out.println("Enter cutomer name : ");
        double unitsConsumed = sc.nextDouble();
        
        ElectricityBill electricityBill = new ElectricityBill(customerName, unitsConsumed);
        electricityBill.calculateBillAmount();
        
    }

}

