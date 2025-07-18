import java.lang.*;
import java.util.*;

public class If_Else1_Solutions2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%3==0 && x%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(x%3==0)
        {
            System.out.println("Fizz");
        }
        else if(x%5==0)
        {
            System.out.println("Buzz");
        }
    }
}