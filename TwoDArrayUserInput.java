import java.util.Scanner;

public class TwoDArrayUserInput {
    
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
        System.out.println();
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
