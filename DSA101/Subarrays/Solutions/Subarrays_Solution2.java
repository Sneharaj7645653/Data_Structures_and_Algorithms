import java.util.*;

public class Subarrays_Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); // consume newline after integer

        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            long ans = 0;
            String vowels = "AEIOUaeiou";

            for (int i = 0; i < n; i++) {
                if (vowels.indexOf(s.charAt(i)) != -1) {
                    ans += (n - i);
                }
            }

            System.out.println(ans % 10003);
        }
    }
}