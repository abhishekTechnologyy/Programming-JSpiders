import java.util.Scanner;

public class LinearSearchInArray {
                                                            // why it is wrong
                                                            // what is the problem
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

        System.out.print("Enter the element you want to find out : ");
        int key = sc.nextInt();

        boolean flag = true;
        int position = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                position = i;
            }
            else
            {
                flag = false;
            }
        }
        if(flag == true)
        {
            System.out.println("The index position where the "+key+" is present is : "+position);
        }
        else
        {
            System.out.println("Element is not present in Array");
        }
        sc.close();
    }
}
