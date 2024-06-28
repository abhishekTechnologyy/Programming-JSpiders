public class Pattern1Recursion {
    
    static void display(int n)
    {
        if(n >= 1)
        {
            System.out.println(n);
            display(n-1);
            System.out.println(n);        }
    }

    public static void main(String[] args) {
        display(3);
    }
}
