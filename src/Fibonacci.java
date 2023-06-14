import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("Iterative: "+Arrays.toString(fibonacciIterative(num)));
        System.out.print("Recursive: ");
        for (int i = 0; i < num; i++) {
            System.out.print( + fibonacciRecursive(i) + ", ");
        }
    }
    public static int [] fibonacciIterative (int num){
        int current;
        int previous = 1;
        int secondPrevious= 0;
        int[] fibonacciArray = new int[num];
        fibonacciArray[0]=secondPrevious;
        fibonacciArray[1]=previous;
        for (int i=2;i<num;i++){
            current = previous+secondPrevious;
            fibonacciArray[i]=current;
            previous=fibonacciArray[i];
            secondPrevious=fibonacciArray[i-1];
        }

        return fibonacciArray;
    }

    public static int fibonacciRecursive(int n){

        if (n<=1){
            return n;
        }
        else {
            return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
        }

    }
}
