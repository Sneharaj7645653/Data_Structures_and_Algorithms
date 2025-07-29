import java.lang.*;
import java.util.*;

public class Loops3_Solution5 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int count = 0;
        while(x>1)
        {
            count++;
            x/=2;
        }
        System.out.println(count);
    }
}