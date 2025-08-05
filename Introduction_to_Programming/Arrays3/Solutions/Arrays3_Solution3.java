import java.lang.*;
import java.util.*;

public class Arrays3_Solution3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i =0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for(int i = 0;i<len;i++)
        {
            for(int j = 0;j<len;j++)
            {
                if(arr[i]!=arr[j])
                {
                    flag = false;
                    break;
                }
                if(flag==false)
                {
                    break;
                }
            }
        }
        if(flag==false && len>=2)
        {
            int max = arr[0];
            for(int i =1;i<len;i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                }
            }

            int ans = arr[0];
            for(int i =0;i<len;i++)
            {
                if(ans<arr[i] && arr[i]<max)
                {
                    ans = arr[i];
                }
            }
            System.out.println(ans);
        }
        else
        {
            System.out.println( "NA");
        }
    }
}