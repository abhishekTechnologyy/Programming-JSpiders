public class LinearSearchByMethod {
    
    static int search(int[] arr , int key)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,25,88,12,3,7,18,20,88};
        int key = 20;

        System.out.println(search(arr, key));
    }
}
