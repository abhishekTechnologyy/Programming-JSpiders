import java.util.Scanner;
public class TakeUserInput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+" element : ");

            arr[i] = sc.nextInt();
        }

        System.out.println("------------------------");
        System.out.println("Your array elemnts are :--");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
