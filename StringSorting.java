import java.util.Scanner;

public class StringSorting {
    
    static void sortString(String s)
    {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        System.out.print("Sorted String is : ");
        sortString(s);

        sc.close();
    }
}
