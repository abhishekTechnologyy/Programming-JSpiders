public class BubbleSort
{
    
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {3,60,35,52,45,320};

        bubbleSort(arr);

        for(int ele : arr)
        {
            System.out.println(ele + " ");
        }
    }
}