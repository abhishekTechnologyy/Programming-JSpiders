public class TargetSumArray {
    
    public static void main(String[] args) {
        
        int arr[] = {2,3,4,6,1,5,7,19,2,8,5,5};
        int target = 10;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
