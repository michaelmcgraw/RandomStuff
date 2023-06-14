import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        printFirstNPrimes(num,2);
        System.out.println("\n"+Arrays.toString(prime(num)));
    }

    public static void printFirstNPrimes(int n, int number) {
        if (n == 0) {
            return;
        }
        if (isPrime(number)) {
            System.out.print(number + " ");
            printFirstNPrimes(n - 1, number + 1);
        } else {
            printFirstNPrimes(n, number + 1);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] prime(int num){
        int[] intArray = new int[num];
        int number=2;
        for (int i=0;i<intArray.length;i++){

            if (isPrime(number)){
                intArray[i]=number;
                number++;
            }
            else {
                number++;
                i--;
            }
        }
        return intArray;
    }

    //ChatGPTVersion
    /*public static int[] prime(int num){
        int[] intArray = new int[num];
        int number = 2;
        int i = 0;
        while (i < num) {
            if (isPrime(number)){
                intArray[i] = number;
                i++;
            }
            number++;
        }
        return intArray;
    }*/
}
