import java.lang.*;
import java.util.*;

public class If_Else2_Solution4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = sc.nextInt();
        if(n>5)
        {
            System.out.println("Yes "+name+" will recieve bonus.");
        }
        else
        {
            System.out.println("No "+name+" will not recieve bonus.");
        }
    }
}