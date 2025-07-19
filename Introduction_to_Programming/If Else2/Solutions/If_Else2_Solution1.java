import java.lang.*;
import java.util.*;

public class If_Else2_Solution1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==1 || n%2==-1)
        {
            if(n>=0)
            {
                System.out.println("Odd-Positive");
            }
            else
            {
                System.out.println("Odd-Negative");
            }
        }
        else
        {
            if(n>=0)
            {
                System.out.println("Even-Positive");
            }
            else
            {
                System.out.println("Even-Negative");
            }
        }
    }
}