import java.lang.*;
import java.util.*;

public class Arrays2_Solution7 {
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
            int[] array = new int[l];
            for(int i = 0;i<l;i++)
            {
                array[i] = sc.nextInt();

            }
            boolean flag = false;
            int tar = sc.nextInt();
            for(int i = 0;i<l;i++)
            {
                if(tar==array[i])
                {
                    flag = true;
                }
            }
            if(flag)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}