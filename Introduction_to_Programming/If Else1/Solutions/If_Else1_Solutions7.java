import java.lang.*;
import java.util.*;

public class If_Else1_Solutions7 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)
        {
            System.out.println(31);
        }
        else if(n==2)
        {
            System.out.println(28);
        }
        else
        {
            System.out.println(30);
        }
    }
}