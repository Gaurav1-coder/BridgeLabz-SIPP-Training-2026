import java.util.Scanner;

public class UpperCaseComparison {

    // Convert text to uppercase using ASCII values
    public static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result += ch;
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // User-defined method
        String upper1 = convertToUpperCase(text);

        // Built-in method
        String upper2 = text.toUpperCase();

        // Compare results
        boolean result = compareStrings(upper1, upper2);

        System.out.println("Uppercase using user-defined method: " + upper1);
        System.out.println("Uppercase using toUpperCase(): " + upper2);
        System.out.println("Are both results equal? " + result);

    }
}