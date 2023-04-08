public class program9 {
    public static void main(String []args){
        byte b=12;
           String str =Byte.toString(b);
           System.out.println(str);

         Byte b1=Byte.valueOf(b);
         System.out.println("byte value into byte instance"+b1);
         
         String s= new String("123");
         
         Byte b2=Byte.parseByte(s);
         System.out.println(b2);

    }
    
}
 