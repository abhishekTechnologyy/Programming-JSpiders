import java.util.Scanner;
public class CheckSumAndProdOfArrayElements {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array - ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+" Element : ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int product = 1;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            product = product * i;
        }
        if(product == sum)
        {
            System.out.println("Sum == Product");
        }
        else
        {
            System.out.println("Sum != Product");
        }

        sc.close();
    }
}
