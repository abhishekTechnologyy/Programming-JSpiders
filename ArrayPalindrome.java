import java.util.Scanner;

public class ArrayPalindrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter the array elements:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+" array element: ");
            arr[i] = sc.nextInt();
        }

            int l = 0;
            int h = arr.length - 1;
            boolean flag = true;

        while(l <= h)
        {

            if(arr[l] == arr[h])
            {
                l++;
                h--;
            }
            else
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
        System.out.println("palindrome");
        }
        else
        {
        System.out.println("not a palindrome");
        }
        sc.close();
    }
}
