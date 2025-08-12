import java.lang.*;
import java.util.*;

public class ArrayList2_Solution4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int s = N - 1, i, j;
        while (s >= 0) {
            i = s;
            j = 0;
            while (i < N && j < M) {
                System.out.print(A[i][j] + " ");
                i++;
                j++;
            }
            s--;
        }
        s = 1;
        while (s < M) {
            i = 0;
            j = s;
            while (i < N && j < M) {
                System.out.print(A[i][j] + " ");
                i++;
                j++;
            }
            s++;
        }
        System.out.println();
    }
}