public class StringToCharArray {
    
    public static void main(String[] args) {
        
        String s = "hello";
        char[] arr1 = new char[s.length()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.charAt(i);
        }
        for(char ele:arr1)
        {
            System.out.println(ele);
        }

        System.out.println("==================");

        char[] arr2 = s.toCharArray();
        for(char ele:arr2)
        {
            System.out.println(ele);
        }
    }
}
