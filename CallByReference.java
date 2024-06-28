public class CallByReference {
    static void fun(int[] arr2)
	{
		System.out.println("arr2: "+arr2);
		arr2[0] = 20;
		System.out.println(arr2[0]);
	}
	public static void main(String[] args) {
		
        int [] arr1 = new int[5];
        System.out.println(arr1[0]);
        System.out.println("arr1 : "+arr1);
        fun(arr1);
        System.out.println(arr1[0]);
	}
}
