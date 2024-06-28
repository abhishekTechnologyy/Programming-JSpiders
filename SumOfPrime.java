import java.util.Scanner;
public class SumOfPrime {
   
    static boolean isPrime(int n)
    {
        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the Elements: ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+" element : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(isPrime(arr[i]))
            {
                sum += arr[i];
            }
        }

        System.out.println("Sum of only prime elements in array = "+sum);

        sc.close();

        System.out.println(isPrime(-97));
    }
}
