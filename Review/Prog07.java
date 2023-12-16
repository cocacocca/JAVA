package Review;

public class Prog07 {
    public static void main(String[] args) {
        int n = 20;

        int[] fibonacciArray = new int[n];

        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
