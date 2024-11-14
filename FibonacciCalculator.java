package proje1;
import java.util.Scanner;

public class FibonacciCalculator {

    // Fibonacci metodu (recursive) 
    public static long recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
//Fibonacci metodu
    public static long Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Zaman karşılaştırması yapan metot
    public static void compareFibonacciMethods(int n) {
        long startTime, endTime;
        
        // recursive metot için zaman ölçümü
        startTime = System.nanoTime();
        long recursiveResult = recursiveFibonacci(n);
        endTime = System.nanoTime();
        long recursiveDuration = endTime - startTime;
        System.out.println("Recursive Fibonacci sonucu: " + recursiveResult);
        System.out.println("Recursive hesaplama süresi: " + recursiveDuration + " nanosecond");

        // fibonacci metot için zaman ölçümü
        startTime = System.nanoTime();
        long fiboResult = Fibonacci(n);
        endTime = System.nanoTime();
        long Duration = endTime - startTime;
        System.out.println("Fibonacci sonucu: " + fiboResult);
        System.out.println(" hesaplama süresi: " + Duration + " nanosecond");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin kaçıncı elemanını hesaplamak istiyorsunuz? ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
        } else {
            compareFibonacciMethods(n);
        }
        
        scanner.close();
    }
}
