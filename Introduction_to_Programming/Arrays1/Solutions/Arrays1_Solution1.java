import java.lang.*;
import java.util.*;

public class Arrays1_Solution1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t>0 )
        {
            int num = sc.nextInt();
            int count = 0;
            int power = 5;
            while( power <= num )
            {
                count += num/power;
                power *= 5;
            }
            System.out.println(count);
            t--;
        }

    }
}