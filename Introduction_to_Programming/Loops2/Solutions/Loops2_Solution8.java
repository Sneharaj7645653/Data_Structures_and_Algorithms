import java.lang.*;
import java.util.*;

public class Loops2_Solution8 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int num = sc.nextInt();
            if(num==0)
                System.out.println(1);
            else
            {
                int count = 0;
                while(num>0)
                {
                    num=num/10;
                    count++;
                }
                System.out.println(count);
            }
            t--;
        }
    }
}