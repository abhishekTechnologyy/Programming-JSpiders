public class FindLengthOfArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int length = 0;

        try
        {
            while(true)
            {
                int n = arr[length];
                length++;
            }
        }
        catch(Exception exp)
        {
            System.out.println("length = "+length);
        }
    }
}
