class IntializeArray{

	public static void main(String[] args) {

        int[] arr = new int[5];

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		arr[0] = 10;
		arr[1] = 20;
		arr[4] = 40;
		
		System.out.println("-------------------------------");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);



	}

}
