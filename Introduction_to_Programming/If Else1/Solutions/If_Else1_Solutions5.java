import java.lang.*;
import java.util.*;

public class If_Else1_Solutions5 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}