import java.util.Scanner;

public class CaesarCipher {
    
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) (((int) ch + shift - 65) % 26 + 65);
                result.append(encryptedChar);
            }
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) (((int) ch + shift - 97) % 26 + 97);
                result.append(encryptedChar);
            }
            else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Caesar Cipher Text Generator!");
        
        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();
        
        String text = "Jai Jawan Jai Kisan";
        
        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);
        
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);
        
        scanner.close();
    }
}
