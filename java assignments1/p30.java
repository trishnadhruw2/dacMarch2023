class p30{
    public static void main(String []args){
         Double number = 123.45;

        byte byteNumber = number.byteValue();
        short shortNumber = number.shortValue();
        int intNumber = number.intValue();
        long longNumber = number.longValue();
        float floatNumber = number.floatValue();
        double doubleNumber = number.doubleValue();

        System.out.println("Byte value: " + byteNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Int value: " + intNumber);
        System.out.println("Long value: " + longNumber);
        System.out.println("Float value: " + floatNumber);
        System.out.println("Double value: " + doubleNumber);
    }
}