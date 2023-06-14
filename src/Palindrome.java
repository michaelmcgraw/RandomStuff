import java.util.Scanner;

public class Palindrome {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.nextLine();
        System.out.println(input + ": "+isPalindrome(input));
    }

    public static String isPalindrome(String input){
        StringBuilder str = new StringBuilder(input);
        String reverseString = str.reverse().toString();


        if (reverseString.equals(input)){
            return "Palindrome";
        }
        else {
            return "Not Palindrome";
        }
    }
}
