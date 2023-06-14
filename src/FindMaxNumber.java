import java.util.Scanner;

public class FindMaxNumber {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int [] intArray = new int[scan.nextInt()];
        for (int i =0;i<intArray.length;i++){
            System.out.print("Enter a number to add to the Array: ");
            intArray[i] = scan.nextInt();
        }

        System.out.print(findMaxNumber(intArray));
    }
    public static String findMaxNumber(int[] intArray){
        int max = intArray[0];
        for(int i : intArray){
            if (i > max){
                max = i;
            }
        }
        return "Max number is: " + max;
    }
}
