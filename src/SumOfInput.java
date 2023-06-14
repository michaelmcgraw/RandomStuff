import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int input = scan.nextInt();
        System.out.println("Sum of the numbers in the integer: "+sumOfInput(input));

    }
    public static int sumOfInput(int input){
        String inputToString = String.valueOf(input);
        char[] charArray = new char[inputToString.length()];

        for (int i=0;i<inputToString.length();i++){
            charArray[i]=inputToString.charAt(i);
        }
        int sum=0;
        for (char c : charArray){
            int intToAdd = Integer.parseInt(String.valueOf(c));
            sum = sum+intToAdd;
        }
        return sum;
    }
}
