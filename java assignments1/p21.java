public class p21 {
    public static void main(String args[]){
        Long myLong = 123456789L;

        // Convert to byte
        byte myByte = myLong.byteValue();
        System.out.println("Byte value: " + myByte);

        // Convert to short
        short myShort = myLong.shortValue();
        System.out.println("Short value: " + myShort);

        // Convert to int
        int myInt = myLong.intValue();
        System.out.println("Int value: " + myInt);

        // Convert to long
        long myLong2 = myLong.longValue();
        System.out.println("Long value: " + myLong2);

        // Convert to float
        float myFloat = myLong.floatValue();
        System.out.println("Float value: " + myFloat);

        // Convert to double
        double myDouble = myLong.doubleValue();
        System.out.println("Double value: " + myDouble);
    }
    
}
