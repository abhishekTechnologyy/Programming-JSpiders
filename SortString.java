public class SortString {
    public static void main(String[] args) {
        
        String s = "hello";

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(char ele : arr)
        {
            System.out.println(ele);
        }
    }


}
