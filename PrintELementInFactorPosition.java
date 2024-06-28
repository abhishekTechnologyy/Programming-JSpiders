public class PrintELementInFactorPosition {
    
    public static void main(String[] args) {
        
        String s = "Welcome Bye";
        int n = s.length();

        for(int i = 1 ; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(s.charAt(i-1));
            }
        }


    }
}
