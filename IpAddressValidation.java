public class IpAddressValidation {
    
    public static void main(String[] args) {
        
        String s = "123.42.87.900";
        String[] arr = s.split("[.]");

        if (arr.length == 4) {
            boolean flag = true;

            for (String string : arr) {
                int n = Integer.parseInt(string);
                if(!(n >=0 && n <= 255))
                {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag == true?"valid":"invalid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
