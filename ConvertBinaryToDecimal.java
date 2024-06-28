public class ConvertBinaryToDecimal {
    
    public static void main(String[] args) {
        
        int bin = 1101;
        int rem = 0;
        int sum = 0;
        int p = 1;

        while(bin != 0)
        {
            rem = bin % 10;
            sum = sum + (rem * p);
            p = p * 2;
            bin = bin / 10;
        }

        System.out.println(sum);
    }
}
