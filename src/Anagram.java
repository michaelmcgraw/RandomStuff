import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string1 = scan.nextLine();
        System.out.print("Enter another String: ");
        String string2 = scan.nextLine();
        System.out.println(isAnagram(string1,string2));

    }
    public static String isAnagram(String string1, String string2){
        char[] string1Array = string1.toCharArray();
        Arrays.sort(string1Array);
        String sortedString1 = new String(string1Array);

        char[] string2Array = string2.toCharArray();
        Arrays.sort(string2Array);
        String sortedString2 = new String(string2Array);

        if (sortedString1.equalsIgnoreCase(sortedString2)){
            return string1 + " and "+ string2+ " are anagrams of each other";
        }
        else {
            return string1 + " and "+ string2+ " are NOT anagrams of each other";
        }
    }
}
