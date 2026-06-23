public class RecursionWizard {

    static int moveCount = 0;

    // Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, helper, source, destination);
    }

    // Recursive Binary Search
    public static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, left, mid - 1, target);

        return binarySearch(arr, mid + 1, right, target);
    }

    // Sum of Digits
    public static int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return n % 10 + sumOfDigits(n / 10);
    }

    // Reverse String
    public static String reverseString(String str) {

        if (str.length() <= 1)
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Balanced Parentheses Without Stack
    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str, int index, int count) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        char ch = str.charAt(index);

        if (ch == '(')
            return checkBalance(str, index + 1, count + 1);

        if (ch == ')')
            return checkBalance(str, index + 1, count - 1);

        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {

        System.out.println("Tower of Hanoi:");

        towerOfHanoi(3, 'A', 'B', 'C');

        System.out.println("Total Moves: " + moveCount);

        int[] prices = {10, 20, 30, 40, 50, 60, 70};

        System.out.println(
                "Binary Search Index: "
                        + binarySearch(prices, 0, prices.length - 1, 50));

        System.out.println("Sum Of Digits (12345): "
                + sumOfDigits(12345));

        System.out.println("Reverse String: "
                + reverseString("Deepika"));

        System.out.println("Balanced Parentheses: "
                + isBalanced("(()())"));
    }
}