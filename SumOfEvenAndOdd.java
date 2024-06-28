import java.util.Scanner;

public class SumOfEvenAndOdd {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter Array Elements --");
        
        int Evensum = 0;
        int OddSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+" Array Element : ");

            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0)
            {
            Evensum += arr[i];
            }
            else
            {
                OddSum += arr[i];
            }
        }

        System.out.println("The sum of Even Array Elements are : "+Evensum);
        System.out.println("The sum of Odd Array Elements are : "+OddSum);

        sc.close();
  
    }
}
