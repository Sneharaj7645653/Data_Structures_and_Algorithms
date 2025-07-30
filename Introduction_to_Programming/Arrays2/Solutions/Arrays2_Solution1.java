import java.lang.*;
import java.util.*;

public class Arrays2_Solution1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        int sum = 0;
        for(int i =0;i<l;i++)
        {
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}