
Q1. Continuous Sum Query
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B


Problem Constraints

1 <= A <= 2 * 105
1 <= L <= R <= A
1 <= P <= 103
0 <= len(B) <= 105


Input Format

The first argument is a single integer A.
The second argument is a 2D integer array B.


Output Format

Return an array(0 based indexing) that stores the total number of coins in each beggars pot.


Example Input

Input 1:-
A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]


Example Output

Output 1:-
10 55 45 25 25


Example Explanation

Explanation 1:-
First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]
Q2. Maximum subarray sum of fixed length
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array A of length N, Find the maximum subarray sum out of all possible subarray of length B.


Problem Constraints

1 <= N <= 105
1 <= A[i] <= 106


Input Format

First argument A is an array of integers.
Second argument B is length of subarray.


Output Format

Return a single integer i.e. max subarray sum


Example Input

Input 1:

A = [6, 7, 8, 2]
B = 2
Input 2:

A = [3, 9, 5, 6, 5, 11]
B = 3


Example Output

Output 1:

15
Output 2:

22


Example Explanation

Explanation 1:

Subarray with maximum sum is [7, 8] with sum 15.
Explanation 2:

Subarray with maximum sum is [6, 5, 11] with sum 22.
Q3. Special Subsequences "AG"
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.



Problem Constraints

1 <= length(A) <= 105



Input Format

First and only argument is a string A.



Output Format

Return an integer denoting the answer.



Example Input

Input 1:

A = "ABCGAG"
Input 2:

A = "GAB"


Example Output

Output 1:

3
Output 2:

0


Example Explanation

Explanation 1:

Subsequence "AG" is 3 times in given string
Explanation 2:

There is no subsequence "AG" in the given string.


Q4. Sub-matrix Sum Queries
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.




Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
The sum may be large, so return the answer mod 109 + 7.
Also, select the data type carefully, if you want to store the addition of some elements.
Indexing given in B, C, D, and E arrays is 1-based.
Top Left 0-based index = (B[i] - 1, C[i] - 1)
Bottom Right 0-based index = (D[i] - 1, E[i] - 1)




Problem Constraints

1 <= N, M <= 1000
-100000 <= A[i] <= 100000
1 <= Q <= 100000
1 <= B[i] <= D[i] <= N
1 <= C[i] <= E[i] <= M



Input Format

The first argument given is the integer matrix A.
The second argument given is the integer array B.
The third argument given is the integer array C.
The fourth argument given is the integer array D.
The fifth argument given is the integer array E.
(B[i], C[i]) represents the top left corner of the i'th query.
(D[i], E[i]) represents the bottom right corner of the i'th query.



Output Format

Return an integer array containing the submatrix sum for each query.



Example Input

Input 1:

A = [   [1, 2, 3]
[4, 5, 6]
[7, 8, 9]   ]
B = [1, 2]
C = [1, 2]
D = [2, 3]
E = [2, 3]
Input 2:

A = [   [5, 17, 100, 11]
[0, 0,  2,   8]    ]
B = [1, 1]
C = [1, 4]
D = [2, 2]
E = [2, 4]


Example Output

Output 1:

[12, 28]
Output 2:

[22, 19]


Example Explanation

Explanation 1:

For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.
Explanation 2:

For query 1: Submatrix contains elements: 5, 17, 0 and 0. So, their sum is 22.
For query 2: Submatrix contains elements: 11 and 8. So, their sum is 19.
