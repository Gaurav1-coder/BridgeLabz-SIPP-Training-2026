import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Check spaces
        if (username.contains(" ")) {
            System.out.println("Username contains spaces.");
        } else {
            System.out.println("Username does not contain spaces.");
        }

        // Character count
        System.out.println("Total Characters: " + username.length());

        // Uppercase
        System.out.println("Uppercase Username: "
                + username.toUpperCase());

        // Palindrome Check
        String reversed = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            reversed += username.charAt(i);
        }

        if (username.equalsIgnoreCase(reversed)) {
            System.out.println("Username is a palindrome.");
        } else {
            System.out.println("Username is not a palindrome.");
        }

        sc.close();
    }
}