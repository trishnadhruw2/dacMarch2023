public class p24 {
    public static void main(String []args){
        float num1 = 3.1415f;
        String str = "2.71828";
        
        // Convert float value to String
        String str1 = Float.toString(num1);
        System.out.println("Float value " + num1 + " converted to String: " + str1);
        
        // Convert float value to Float instance
        Float num2 = Float.valueOf(num1);
        System.out.println("Float value " + num1 + " converted to Float instance: " + num2);
        
        // Convert String instance to Float instance
        Float num3 = Float.valueOf(str);
        System.out.println("String instance " + str + " converted to Float instance: " + num3);
        
        // Convert float value to hexadecimal string
        String hexString = Float.toHexString(num1);
        System.out.println("Float value " + num1 + " converted to hexadecimal string: " + hexString);
    }
    
}
