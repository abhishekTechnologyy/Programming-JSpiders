public class FindLargestWord {
    
    public static void main(String[] args) {
        
        String s1 = "hello hi level";
        String[] arr = s1.split(" ");

        int max = arr[0].length();
        String ans = arr[0];

        for(String ele:arr)
        {
            if(max < ele.length())
            {
                max = ele.length();
                ans = ele;
            }
        }

        System.out.println(ans);
    }
}
