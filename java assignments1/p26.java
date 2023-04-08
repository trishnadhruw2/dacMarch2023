public class p26 {
    public static void main(String []args){
        float num1 = 3.141f;
        float num2 = 2.7182f;
        
        // Find minimum of two float values
        float min = Float.min(num1, num2);
        System.out.println( min);
        
        // Find maximum of two float values
        float max = Float.max(num1, num2);
        System.out.println(max);
        
        // Add two float values
        float sum = Float.sum(num1, num2);
        System.out.println(sum);
    }
    
}
