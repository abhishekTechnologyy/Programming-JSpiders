import java.util.Scanner;

public class CharacterCount {
    
    // Function to count occurrences of a specific character in a string
    public static int countCharacter(String str, char ch) {
        int count = 0;
        
        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // If the current character matches the specific character, increment count
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        
        System.out.println("Enter the character to count:");
        char ch = scanner.next().charAt(0); // Read the first character of the input
        
        int charCount = countCharacter(str, ch);
        
        System.out.println("The character '" + ch + "' occurs " + charCount + " times in the given data.");
        
        scanner.close();
    }
}
