public class ReverseEachWordInString {
    
    static String reverse(String s)
    {
        String res = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            res = res + s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        
        String s = "hello hi bye";
        String[] arr = s.split(" ");

        for(String ele:arr)
        {
            System.out.print(reverse(ele)+" ");
        }
    }
}
