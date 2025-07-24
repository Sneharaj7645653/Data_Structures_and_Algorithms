import java.lang.*;
import java.util.*;

public class Loops2_Solution2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int sum = 0;
        while(num>0)
        {
            sum = sum*10+(num%10);
            num=num/10;
        }
        if(num2-sum==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}