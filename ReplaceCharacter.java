public class ReplaceCharacter {
    
    public static void main(String[] args) {
        
        String s = "hello hi bye";
        char c1 = 'e';
        char c2 = '$';

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == c1)
            {
                System.out.print(c2);;
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
