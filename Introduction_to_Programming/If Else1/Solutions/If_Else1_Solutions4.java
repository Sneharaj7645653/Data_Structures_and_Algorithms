import java.lang.*;
import java.util.*;

public class If_Else1_Solutions4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=10000000)
        {
            System.out.println("diamond");
        }
        else if(n>=1000000)
        {
            System.out.println("platinum");
        }
        else if(n>=500000 )
        {
            System.out.println("gold");
        }
        else
        {
            System.out.println("None");
        }
    }
}