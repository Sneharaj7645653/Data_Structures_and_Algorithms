import java.lang.*;
import java.util.*;

public class If_Else1_Solutions10 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b==1 && a==0)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}