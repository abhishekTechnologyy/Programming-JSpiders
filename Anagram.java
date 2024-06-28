import java.util.Scanner;

public class Anagram {
    
    static String sortString(String s)
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
        return(new String(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter the 2nd String : ");
        String s2 = sc.nextLine();

        if(sortString(s1).equals(sortString(s2)))
        {
            System.out.println("Anagram");
        }
        else{
            System.out.println("not");
        }
    }
}
