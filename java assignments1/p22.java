public class p22 {
    public static void main(String []args){
        Long num1 = 12345L;
        Long num2 = 98765L;
        
        // Find minimum and maximum numbers
        Long min = Long.min(num1, num2);
        Long max = Long.max(num1, num2);
        
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        
        // Add two long numbers
        Long sum = Long.sum(num1, num2);
        
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    }
    
}
