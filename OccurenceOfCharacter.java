public class OccurenceOfCharacter {
    
    public static void main(String[] args) {
        
        String s = "hello";
        char[] arr = s.toCharArray();
        char[] temp = s.toCharArray();
        
        // for(char i = 0; i < arr.length; i++)
        // {
        //     for(int j = 0; j < temp.length; j++)
        //     {
        //         System.out.println(arr[i]+" "+temp[j]);
        //         System.out.println(arr[i] == temp[j]);
        //     }
        //     System.out.println("==========================");
        // }

         for(char i = 0; i < arr.length; i++)
        {
            int c = 0;

            for(int j = 0; j < temp.length; j++)
            {
                if(arr[i] == temp[j])
                {
                    c++;
                    temp[j] = ' '; //'\0 v likh skte hai.. but maine space lia yha pe' // ye nhi likhenge to 'l' 2 baar h to 2 baar 'l' aaega.. but we calculated one time that's why
                }
            }
            
            if(c > 0)
            {
            System.out.println(arr[i]+" - "+c);
            }
        }
    }
}
