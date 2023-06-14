import java.util.Scanner;

public class NumVowels {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = scan.nextLine();
        System.out.print("Number of vowels: "+numVowels(inputString));
    }

    public static int numVowels(String inputString){
        inputString=inputString.toLowerCase();
        char[] charArray = inputString.toCharArray();
        int count=0;
        for (int i=0;i<inputString.length();i++){
            if (charArray[i]== 'a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u'){
                count++;
            }
        }
        return count;
    }
}
