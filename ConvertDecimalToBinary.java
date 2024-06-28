public class ConvertDecimalToBinary {
    
    public static void main(String[] args) {
        
        int n = 13;
        String bin = "";
        int rem = 0;

        while(n != 0)
        {
            rem = n % 2;
            bin = rem + bin;
            n = n/2;
        }

        System.out.println(bin);
    }
}
