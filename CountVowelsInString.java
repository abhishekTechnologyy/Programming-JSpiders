import java.util.Scanner;

public class CountVowelsInString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        s = s.toUpperCase();

        int count = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                count++;
            }
        }
        System.out.println("vowels :"+count);

        sc.close();

    }
}
