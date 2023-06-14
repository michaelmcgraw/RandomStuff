import java.util.HashMap;
import java.util.Scanner;

public class MaxOccurringChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence to see max occurring char: ");

        String input = scan.nextLine();

        input = input.replaceAll("\\s","");
        input = input.toUpperCase();

        System.out.print("The max occurring char is: ");

        System.out.println(getMaxOccurringChar(input));

    }

    public static Object getMaxOccurringChar(String inputString) {

        HashMap<Integer, Character> charMap = new HashMap<>();
        int count = 0;
        int maxCount = 0;
        char maxChar = '\0';


        for (int i = 0; i < inputString.length(); i++) {
            char charAtIndex = inputString.charAt(i);
            charMap.put(i, charAtIndex);
        }

        for (HashMap.Entry<Integer, Character> entry : charMap.entrySet()) {
            for (int i = 0; i < inputString.length(); i++) {
                char charAtIndex = inputString.charAt(i);
                count=0;
                for (int j = 0; j < inputString.length(); j++) {
                    if (inputString.charAt(j) == charAtIndex) {
                        count++;
                    }

                    if (count > maxCount) {
                        maxCount=count;
                        maxChar = charAtIndex;

                    }

                }
            }



        }
        return maxChar + "-"+ maxCount;
    }
}
