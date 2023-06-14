import java.util.Scanner;

public class WordCount {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scan.nextLine();
        System.out.println("Number of words in sentence: " + wordCount(input));

    }
    public static int wordCount(String input){
        String [] strArray = input.split("\\s+");

        return strArray.length;
    }
}
