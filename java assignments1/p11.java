
public class p11{
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please enter a character as a command line argument.");
            return;
        }
        char ch = args[0].charAt(0);
        if (Character.isLetter(ch)) {
            System.out.println("The character is a letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("The character is a digit.");
            System.out.println("Value: " + Character.getNumericValue(ch));
            System.out.println("Code point: " + (int) ch);
        } else {
            System.out.println("The character is not a letter or a digit.");
        }
    }
}