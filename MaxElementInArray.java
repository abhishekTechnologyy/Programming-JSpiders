import java.util.Scanner;

public class MaxElementInArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the elements in array : ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+" element : ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array = "+max);
        sc.close();
    }
}
