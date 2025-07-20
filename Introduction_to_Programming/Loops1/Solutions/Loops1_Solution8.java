import java.lang.*;
import java.util.*;

public class Loops1_Solution8 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i=1;
        while(i<=5)
        {
            System.out.print(n+(i*m)+" ");
            i++;
        }
        sc.close();
    }
}