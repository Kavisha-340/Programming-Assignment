import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        if (containsVowel(inputString)) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowel.");
        }

        scanner.close();
    }

    private static boolean containsVowel(String str) {
        str = str.toLowerCase();
        return str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u");
    }
}
