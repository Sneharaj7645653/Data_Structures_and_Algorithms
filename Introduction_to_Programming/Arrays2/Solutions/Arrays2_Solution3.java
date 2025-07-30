import java.lang.*;
import java.util.*;

public class Arrays2_Solution3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] nums  = new int[l];

        for (int i = 0; i < l; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 0;i<l;i++)
        {
            System.out.print(nums[l-i-1]+" ");
        }
    }
}