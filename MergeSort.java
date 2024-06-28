public class MergeSort {
    
    static void merge(int[] arr, int l , int m , int h)
    {
        int[] larr = new int[m-l+1];
        int[] rarr = new int[h-m];

        int x = l;

        for(int i = 0; i < larr.length; i++)
        {
            larr[i] = arr[x];
            x++;
        }

        for(int i = 0; i < rarr.length; i++)
        {
            rarr[i] = arr[x];
            x++;
        }

        int i = 0, j = 0, k = l;

        while(i < larr.length && j < rarr.length)
        {
            if(larr[i] < rarr[j])
            {
                arr[k] = larr[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = rarr[j];
                j++;
                k++;
            }
        }

        while (j < rarr.length) {
            arr[k] = rarr[j];
            j++;
            k++;
        }

        while (i < larr.length) {
            arr[k] = larr[i];
            i++;
            k++;
        }

    }

    static void sort(int[] arr, int l, int h)
    {
        if(l<h)
        {
            int m = (l+h)/2;
            sort(arr, l, m);
            sort(arr, m+1, h);
            merge(arr, l, m, h);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,1,11,3,13,20,25,7,17,31,5,36,2};

        merge(arr, 3, 6, 9);

        for (int ele : arr) {
            System.err.print(ele+" ");
        }
    }
}
