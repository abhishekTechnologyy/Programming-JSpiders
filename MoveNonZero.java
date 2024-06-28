public class MoveNonZero {
    
    public static void main(String[] args) {
        
        int[] arr = {4,0,9,2,0,12,0,6,7,0};
        int[] temp = new int[arr.length];

        int k = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                temp[k] = arr[i];
                k++;
            }
        }

        for(int i = 0; i < temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
