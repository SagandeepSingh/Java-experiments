import java.util.Scanner;

public class countstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        int vowels = 0, consonants = 0, digits = 0, specialCharacters = 0;
        String vowelsList = "AEIOUaeiou";
        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelsList.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                specialCharacters++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialCharacters);
    }
}
