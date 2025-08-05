import java.lang.*;
import java.util.*;

public class Arrays3_Solution1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1;k<=t;k++)
        {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i = 0;i<len;i++)
            {
                arr[i] = sc.nextInt();

            }
            for(int i = 0;i<len;i++)
            {
                if(arr[i]%2==1)
                {
                    System.out.print(arr[i]+" ");
                }

            }
            System.out.println();
            for(int i = 0;i<len;i++)
            {
                if(arr[i]%2==0)
                {
                    System.out.print(arr[i]+" ");
                }

            }
            System.out.println();
        }
    }
}