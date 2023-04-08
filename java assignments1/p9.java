public class p9 {
    public static void main(String []args){
        byte value = 125;
        Byte bs=new Byte(value);

        byte num1 = bs.byteValue();
        System.out.println(num1);

        short num2 = bs.shortValue();
        System.out.println(num2);

        int num3 = bs.intValue();
        System.out.println(num3);

        float num4= bs.floatValue();
        System.out.println(num4);

        double num5=bs.doubleValue();
        System.out.println(num5);
    }
}
