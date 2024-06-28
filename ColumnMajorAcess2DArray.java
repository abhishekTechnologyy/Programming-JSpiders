import java.util.Scanner;

public class ColumnMajorAcess2DArray {
    
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

        System.out.println();
        
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length; j++ )
            { 
            //System.out.print(arr[j][i]+" "); ye line likhne pe column major print hoga .. but we want to change in 2d array then print
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
                                                          