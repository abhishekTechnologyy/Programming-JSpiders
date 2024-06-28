public class CharArrayToString {
    
    public static void main(String[] args) {
        
        char[] arr = {'h','e','l','l','o'};
        String s = "";

        for(char ele:arr)
        {
            s = s + ele;
        }
        System.out.println(s);

        System.out.println("====================");
        String s2 = new String(arr);
        System.out.println(s2);
        System.out.println(new String(arr));

    }
}
