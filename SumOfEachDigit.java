public class SumOfEachDigit {
   
    public static void main(String[] args) {
        
    int[] arr = {25,29,11,35,22};

    for(int i = 0; i < arr.length; i++)
    {
        int sum = 0;
        int rem = 0;
        if(arr[i]>9)
        {
            int n = arr[i];
            while(n > 0)
            {
                rem = n % 10;
                sum += rem;
                n = n / 10;
            }
            arr[i] = sum;
        }
    }

    for(int i  = 0; i < arr.length; i++)
    {
        System.out.print(arr[i]+ " ");
    }


  }
}
