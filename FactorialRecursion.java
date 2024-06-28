public class FactorialRecursion {
    
    static int fact(int n)
    {
        if(n==0 || n==1|| n==2)
        {
            return n;
        }
        else
        {
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
