import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountUniqueCharacters {
    public static void main(String[] args) {
        String input = "hello";
        int count = countUniqueCharacters(input);
        System.out.println("Number of unique characters: " + count);
    }

    public static int countUniqueCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!repeatedChars.contains(ch)) {
                if (uniqueChars.contains(ch)) {
                    uniqueChars.remove(ch);
                    repeatedChars.add(ch);
                } else {
                    uniqueChars.add(ch);
                }
            }
        }

        return uniqueChars.size();
    }
}
