public class p29 {
    public static void main(String args[]){
        Double d = 123.45;

        // Convert Double instance to byte
        byte b = d.byteValue();
        System.out.println("Byte value: " + b);
    
        // Convert Double instance to short
        short s = d.shortValue();
        System.out.println("Short value: " + s);
    
        // Convert Double instance to int
        int i = d.intValue();
        System.out.println("Int value: " + i);
    
        // Convert Double instance to long
        long l = d.longValue();
        System.out.println("Long value: " + l);
    
        // Convert Double instance to float
        float f = d.floatValue();
        System.out.println("Float value: " + f);
    
        // Convert Double instance to double
        double db = d.doubleValue();
        System.out.println("Double value: " + db);
    }
    
}
