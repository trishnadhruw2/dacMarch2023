public class program8 {
    public static void main(String []args ){
        int num =12;
        String str=Integer.toString(num);
        System.out.println("integer to string "+str); 
     boolean b= true;
     Boolean b1=Boolean.valueOf(b);
       System.out.println(b1);
        
       String str1= new String("123");
       boolean b2=Boolean.getBoolean(str1);
       System.out.println(b2);

       String str2= new String("124");
       Boolean b3=Boolean.getBoolean(str2);
     System.out.println(b3);


    }
    
}
