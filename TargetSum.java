import java.util.Scanner;

public class TargetSum {
    
    static void sort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array - ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+" Element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(("==========================="));

        int target = 10;

        sort(arr);
        int i = 0, j = arr.length-1;
        while (i < j) 
        {
            if (arr[i]+arr[j] == target) 
            {
                System.out.println("your TARGET UNIQUE NUMBERS are :-");
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
            else if (arr[i]+arr[j] > target) 
            {
                j--;                
            }
            else
            {
                i++;
            }
        }
        sc.close();
    }
}
