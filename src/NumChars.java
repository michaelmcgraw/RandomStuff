import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumChars {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = scan.nextLine();
        System.out.println(numChars(inputString));
        System.out.println(numChars2(inputString));
    }

    public static HashMap<Character,Integer> numChars(String inputString){
        inputString=inputString.toLowerCase();
        char[] charArray = inputString.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i=0; i<inputString.length();i++){
            charMap.put(charArray[i],0);
        }
        int count;
        Set<Character> keys = charMap.keySet();
        for (int i=0;i<inputString.length();i++){
            for (Character key : keys){
                count=charMap.get(key);
                if (key==charArray[i]){
                    count++;
                    charMap.replace(key,count);
                }

            }
        }


        return charMap;
    }
    public static HashMap<Character,Integer> numChars2(String inputString){
        inputString=inputString.toLowerCase();
        char[] charArray = inputString.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = charArray[i];
            int count = charMap.getOrDefault(c, 0);
            charMap.put(c, count + 1);
        }
        return charMap;
    }
}
