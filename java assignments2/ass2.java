import java.util.Scanner;

public class ass2 {
    public static void main(String []args){
      System.out.println("enter your height and weight");
      Scanner sc=new Scanner(System.in);
        double h=sc.nextDouble();
        double w=sc.nextDouble();
        BmiCal obj=new BmiCal(h,w);
          System.out.println("body mass is "+obj.calculateBMI());
    }
    
}

class BmiCal{
    double height;
    double weight;
    BmiCal(double height,double weight){
        this.height=height;
        this.weight=weight;
    }
    BmiCal(){

    }

    void getData(double height,double weight){
        this.height=height;
        this.weight=weight;
    }
    void setData(){
    System.out.println("height is = "+height+" mtr");
    System.out.println("weight is= "+weight+" kg");
}
   double calculateBMI(){
       double BMI=weight/(height*height);
       return BMI;
   }

}