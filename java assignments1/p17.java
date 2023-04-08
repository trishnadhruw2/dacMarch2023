public class p17 {
    public static void main(String []args){
        Integer myInteger = 5678;

        // Convert to byte
        byte myByte = myInteger.byteValue();
        System.out.println("Byte value: " + myByte);

        // Convert to short
        short myShort = myInteger.shortValue();
        System.out.println("Short value: " + myShort);

        // Convert to int
        int myInt = myInteger.intValue();
        System.out.println("Int value: " + myInt);

        // Convert to long
        long myLong = myInteger.longValue();
        System.out.println("Long value: " + myLong);

        // Convert to float
        float myFloat = myInteger.floatValue();
        System.out.println("Float value: " + myFloat);

        // Convert to double
        double myDouble = myInteger.doubleValue();
        System.out.println("Double value: " + myDouble);
    }
    
}
