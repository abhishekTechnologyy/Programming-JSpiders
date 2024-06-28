public class LinearSearchArray2 {
    
    public static void main(String[] args) {
        
        int[] arr = {1,25,88,12,3,7,18,20,88};
        int pos = -1;
        int key = 88;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                pos = i;
                break;
            }
        }

        System.out.println(pos);
    }
}
