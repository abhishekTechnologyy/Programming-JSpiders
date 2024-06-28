public class CallByValue {
    
    static void fun(int x)
    {
        x = 20;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(n);
        fun(n);
        System.out.println(n);
    }
}
