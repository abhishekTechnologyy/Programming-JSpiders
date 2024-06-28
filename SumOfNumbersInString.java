public class SumOfNumbersInString {
    
    public static void main(String[] args) {
        
        String s = "hi hello 100 bye 200 how 300 are you 123";

        String[] arr = s.split(" ");

        int sum = 0;

        for(String ele:arr)
        {
            try
            {
            int n1 = Integer.parseInt(ele);
            sum = sum + n1; //or directly .. sum = sum + Integer.parseInt(ele);
            }
            catch(Exception exp)
            {

            }
        }
        System.out.println(sum);
    }
}
