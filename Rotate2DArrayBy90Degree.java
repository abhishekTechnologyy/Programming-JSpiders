import java.util.Scanner;

public class Rotate2DArrayBy90Degree {

    static void reverseArr(int[] arr)
    {
        int l = 0, h = arr.length-1;

        while(l<h)
        {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("enter rows:");
        int row = sc.nextInt();

        System.out.print("enter col:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("enter the elements:");

        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length; j++ )
            {
                System.out.print("Enter "+i+" row "+j+" col "+" elements: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length;i++)
        {
            for(int j = i; j < arr[i].length; j++ )
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //{ {1,4,7}, {2,5,8}, {3,6,9}}

        System.out.println();

        for(int i = 0; i < arr.length;i++)
        {
            reverseArr(arr[i]);
        }
        //{ {7,4,1}, {8,5,2}, {9,6,3}}
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length; j++ )
            { 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
