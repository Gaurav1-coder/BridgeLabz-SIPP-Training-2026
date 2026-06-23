import java.util.*;

public class SpyAgency {

    // Reverse Message
    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }

    // Palindrome Check
    public static boolean isPalindrome(String msg) {
        String rev = reverseMessage(msg);
        return msg.equalsIgnoreCase(rev);
    }

    // Count Vowels and Consonants
    public static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        for (char ch : msg.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Anagram Check
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[26];

        for (char ch : s1.toLowerCase().toCharArray())
            freq[ch - 'a']++;

        for (char ch : s2.toLowerCase().toCharArray())
            freq[ch - 'a']--;

        for (int num : freq)
            if (num != 0)
                return false;

        return true;
    }

    // First Non-Repeating Character
    public static char firstNonRepeating(String log) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : log.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : log.toCharArray()) {
            if (map.get(ch) == 1)
                return ch;
        }

        return '\0';
    }

    public static void main(String[] args) {

        String message = "madam";

        System.out.println("Reversed: " + reverseMessage(message));
        System.out.println("Palindrome: " + isPalindrome(message));

        countVowelsConsonants(message);

        System.out.println("Anagram: " +
                areAnagrams("listen", "silent"));

        char result = firstNonRepeating("aabbcdeff");

        if (result != '\0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No unique character found");
    }
}