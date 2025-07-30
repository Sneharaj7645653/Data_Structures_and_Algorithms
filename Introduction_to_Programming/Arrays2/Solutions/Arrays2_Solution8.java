import java.lang.*;
import java.util.*;

public class Arrays2_Solution8 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k =1;k<=t;k++)
        {
            int l = sc.nextInt();
            int[] arr = new int[l];
            for(int i = 0;i<l;i++)
            {
                arr[i] = sc.nextInt();
            }
            int even = 0;
            int odd = 0;
            for(int i = 0;i<l;i++)
            {
                if(arr[i]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
            if(even>odd)
            {
                System.out.println(even-odd);
            }
            else
            {
                System.out.println(odd-even);

            }
        }
    }
}