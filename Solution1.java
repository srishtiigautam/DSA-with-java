import java.util.Scanner;

public class Solution1 {
    public long maximumSubsequenceCount(String text, String pattern) {
        if (text == null || pattern == null || pattern.length() < 2) {
            return 0; // Handle invalid input
        }

        int[] cnt = new int[26];
        char a = pattern.charAt(0);
        char b = pattern.charAt(1);
        long ans = 0;

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == b && (a - 'a') >= 0 && (a - 'a') < 26) {
                    ans += cnt[a - 'a'];
                }
                cnt[c - 'a']++;
            }
        }

        if ((a - 'a') >= 0 && (a - 'a') < 26 && (b - 'a') >= 0 && (b - 'a') < 26) {
            ans += Math.max(cnt[a - 'a'], cnt[b - 'a']);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        long result = solution.maximumSubsequenceCount(text, pattern);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
