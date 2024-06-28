public class StringSequenceSubstring {
    
    public static void main(String[] args) {
        
        String s = "abcd";

        for(int i = 0; i < s.length(); i++)
        {
            String temp = ""+s.charAt(i);
            System.out.println(temp);

            for(int j = i + 1; j < s.length(); j++)
            {
                temp = temp + s.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
