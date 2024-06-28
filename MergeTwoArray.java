public class MergeTwoArray {
    
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int res[] = new int[arr1.length+arr2.length];

        for(int i = 0; i < res.length; i++)
        {
            if(i < arr1.length){
                res[i] = arr1[i];
            }
            else{
                res[i] = arr2[i-arr2.length];
            }
        }
        for (int i : res) {
            System.out.print(i+" "); 
        }

    }
}
