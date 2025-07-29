import java.lang.*;
import java.util.*;

public class Loops3_Solution2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i = Math.min(num1,num2);i>=1;i--)
        {
            if(num1%i==0 && num2%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}