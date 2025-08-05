import java.lang.*;
import java.util.*;

public class Arrays3_Solution2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k =1;k<=t;k++)
        {
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0;i<len;i++)
            {
                int temp=arr[i];
                boolean flag = true;
                for(int j = 0;j<len;j++)
                {
                    if(arr[j]==temp && j!=i)
                    {
                        flag = false;
                        break;
                    }

                }
                if(flag)
                {
                    System.out.print(arr[i]+" ");
                }

            }
            System.out.println();
        }
    }
}
