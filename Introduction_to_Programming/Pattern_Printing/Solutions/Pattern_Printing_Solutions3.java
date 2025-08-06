import java.lang.*;
import java.util.*;

public class Pattern_Printing_Solutions3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}