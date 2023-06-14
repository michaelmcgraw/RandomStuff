import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestWord {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        List<String> sentence = new ArrayList<>();

        // Read the entire line as a sentence
        String input = scan.nextLine();

        // Split the input into individual words
        String[] words = input.split("\\s+");

        // Add words to the sentence list
        sentence.addAll(Arrays.asList(words));

        System.out.println(longestWord(sentence));
    }

    public static String longestWord (List<String> sentence){
        String longest= "";
        int max = 0;
        for (String word : sentence){
            if (word.length()>max){
                longest=word;
                max = word.length();
            }
        }
        return longest;
    }
}
