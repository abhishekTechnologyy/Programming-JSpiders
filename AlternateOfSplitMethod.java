public class AlternateOfSplitMethod {
    
    public static void main(String[] args) {
        
        String s = "hello hi bye";
        int sp = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                sp++;
            }
        }

        String[] arr = new String[sp+1];
        int k = 0;
        String temp = "";
        s = s + " ";

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)== ' ')
            {
                arr[k] = temp;
                k++;
                temp = "";
            }
            else
            {
                temp = temp + s.charAt(i);
            }
        }
        //arr[k] = temp;

        for(String ele:arr)
        {
            System.out.println(ele);
        }
    }
}
