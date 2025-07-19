import java.lang.*;
import java.util.*;

public class If_Else2_Solution2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>18)
        {
            System.out.println("N is Greater than 18");
        }
        else if(n==18)
        {
            System.out.println("N is equal to 18");
        }
        else
        {
            System.out.println("N is smaller than 18");
        }
    }
}