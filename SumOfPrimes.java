import java.util.Scanner;

public class SumOfPrimes {
    
    // static boolean isPrime(int num)
    // {
    //     if(num <= 1)
    //     {
    //         return false;
    //     }
    //     for(int i = 2; i <= Math.sqrt(num); i++)
    //     {
    //         if (num % i ==0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // static int primeSum(int l, int r)
    // {
    //     int sum = 0;
    //     int min = 0;
    //     int max = 0;

    //     for (int i = r; i >= l; i--)
    //     {
           
    //         if (isPrime(i)) {
    //             if (i > max) {
    //                 max = i;
    //             }
    //             else{
    //                 min = i;
    //             }
    //         }
    //         if (i < 0) {
    //             min = i;
    //         }
    //     }
 
    //       sum = max + min;
    //       return sum;  
            
    // }
    // public static void main(String[] args) {
    //     System.out.println( primeSum((-97),50));
    //     System.out.println(isPrime(2));
    // }

     // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Function to find the smallest and largest prime numbers in a range and return their sum
    public static int primeSumInRange(int start, int end) {
        int smallestPrime = Integer.MAX_VALUE;
        int largestPrime = Integer.MIN_VALUE;
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                smallestPrime = Math.min(smallestPrime, i);
                largestPrime = Math.max(largestPrime, i);
            }
        }
        
        return smallestPrime + largestPrime;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the starting number of the range:");
        int start = scanner.nextInt();
        
        System.out.println("Enter the ending number of the range:");
        int end = scanner.nextInt();
        
        int sum = primeSumInRange(start, end);
        
        System.out.println("Sum of the smallest and largest prime numbers in the range: " + sum);
        
        scanner.close();
    }
}
