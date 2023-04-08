public class p14 {
    public static void main(String []args){
        Short myShort = 1234;

        // Convert to byte
        byte myByte = myShort.byteValue();
        System.out.println("Byte value: " + myByte);

        // Convert to int
        int myInt = myShort.intValue();
        System.out.println("Int value: " + myInt);

        // Convert to long
        long myLong = myShort.longValue();
        System.out.println("Long value: " + myLong);

        // Convert to float
        float myFloat = myShort.floatValue();
        System.out.println("Float value: " + myFloat);

        // Convert to double
        double myDouble = myShort.doubleValue();
        System.out.println("Double value: " + myDouble);
    }
    
}
