import java.lang.*;
import java.util.*;

public class Arrays3_Solution4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i<len;i++)
        {
            arr[i] = sc.nextInt();

        }

        int even = 0;
        int odd = 0;
        for(int i = 0;i<len;i++)
        {
            if(arr[i]%2==0)
            {
                even = even+arr[i];
            }
            else
            {
                odd = odd+arr[i];
            }

        }
        System.out.println(even +" "+odd);
    }
}