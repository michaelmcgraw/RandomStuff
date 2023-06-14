import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a target number");
        int target = scan.nextInt();
        ArrayList<Integer> intArray = new ArrayList<>();
        String userInput;
        do {
            System.out.print("Enter a number (or 'q' to quit): ");
            userInput = scan.nextLine();

            if (!userInput.equalsIgnoreCase("q")) {
                try {
                    int num = Integer.parseInt(userInput);
                    intArray.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                }
            }
        } while (!userInput.equalsIgnoreCase("q"));
        System.out.println(intArray);

        System.out.println(targetSum(intArray,target));
    }


    public static List<Integer> targetSum(ArrayList<Integer> intArray, int target){
        ArrayList<Integer> ansArray = new ArrayList<>(2);

        for (int i=0; i< intArray.size();i++){
            for (int j=0; j< intArray.size(); j++){
                if (intArray.get(i) + intArray.get(j) == target){
                    ansArray.add(i);
                    ansArray.add(j);
                    return ansArray;
                }
            }
        }
        return null;
    }
}
