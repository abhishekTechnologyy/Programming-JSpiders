public class CountAplhaNumericsInString {
    
    public static void main(String[] args) {
        
        int alpha = 0;
        int numericals = 0;
        int specialCharacter = 0;

        String s = "uygfuasgku873682q682@$^((*#^*hjvbchsvd))";

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);        

            if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))
            {
             alpha++;
            }
            else if(c >= '0' && c <= '9')
            {
                numericals++;
            }
            else
            {
                specialCharacter++;
            }
        }

        System.out.println("alphabets = "+alpha);
        System.out.println("Numericals = "+numericals);
        System.out.println("SpecialCharacter = "+specialCharacter);

    }
}
