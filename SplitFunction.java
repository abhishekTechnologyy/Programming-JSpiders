public class SplitFunction {
    
    public static void main(String[] args) {
        
        String s1 = "Hello Hi Bye";
        String[] arr1 = s1.split(" ");
        for (String ele : arr1) {
            System.out.println(ele);
        }

        System.out.println("====================");
        String s2 = "@Aman@Suno na Bro @";
        String[] arr2 = s2.split("@");
        for (String string : arr2) {
            System.out.println(string);
        }

        System.out.println("====================");
        String s3 = "123.667.23.890.345";
        String[] arr3 = s3.split("[.]");
        for (String string : arr3) {
            System.out.println(string);
        }
    }
}
