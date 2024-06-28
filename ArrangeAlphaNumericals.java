public class ArrangeAlphaNumericals {
    
    public static void main(String[] args) {
        
        String s = "jsbwibiu85y43buhief8749ty8%%^$^&eru73f4rju34v&^%&*#";

        //we have to arrange characters from back side ..
        String alpha = "", numericals = "",specialCharacters = "";

        for(int i = s.length()-1; i >= 0; i--)
        {
            char ch = s.charAt(i);

            if( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') )
            {
                alpha = alpha + ch;
            }

            else if(ch >= '0' && ch <= '9')
            {
                numericals = numericals + ch;
            }

            else
            {
                specialCharacters = specialCharacters + ch;
            }

        }
        System.out.println("Arranged String is : "+alpha+" "+numericals+" "+specialCharacters);
    }
}
