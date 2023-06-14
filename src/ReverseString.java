import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String to reverse: ");
        String inputString = scan.nextLine();
        System.out.print(reverseString(inputString));
    }

    public static String reverseString(String inputString){
        StringBuilder string = new StringBuilder(inputString).reverse();


        return string.toString();
    }
}
