import java.lang.*;
import java.util.*;

public class Loops2_Solution6 {
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
            int sum = 0;
            while(num>0)
            {
                sum = sum+(num%10);
                num=num/10;
            }
            System.out.println(sum);
            t--;
        }
    }
}