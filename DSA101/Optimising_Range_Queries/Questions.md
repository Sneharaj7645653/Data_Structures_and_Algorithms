# Practice Problems

## Q1. Equilibrium index of an array


### Problem Description

You are given an array **A** of integers of size **N**.

Your task is to find the equilibrium index of the given array.

The equilibrium index of an array is an index such that the sum of
elements at lower indexes is equal to the sum of elements at higher
indexes.

If there are no elements that are at lower indexes or at higher indexes,
then the corresponding sum of elements is considered as 0.

**Note:**\
- Array indexing starts from 0.\
- If there is no equilibrium index then return -1.\
- If there are more than one equilibrium indexes then return the minimum
  index.

### Problem Constraints

    1 <= N <= 10^5
    -10^5 <= A[i] <= 10^5

### Input Format

First argument is an array **A**.

### Output Format

Return the equilibrium index of the given array. If no such index is
found then return -1.

### Example Input

    Input 1:
    A = [-7, 1, 5, 2, -4, 3, 0]

    Input 2:
    A = [1, 2, 3]

### Example Output

    Output 1:
    3

    Output 2:
    -1

### Example Explanation

**Explanation 1:**

    i   Sum of elements at lower indexes    Sum of elements at higher indexes
    0                   0                                   7
    1                  -7                                   6
    2                  -6                                   1
    3                  -1                                  -1
    4                   1                                   3
    5                  -3                                   0
    6                   0                                   0

3 is an equilibrium index, because:\
`A[0] + A[1] + A[2] = A[4] + A[5] + A[6]`

**Explanation 2:**

    i   Sum of elements at lower indexes    Sum of elements at higher indexes
    0                   0                                   5
    1                   1                                   3
    2                   3                                   0

Thus, there is no such index.

------------------------------------------------------------------------

## Q2. Range Sum Query


### Problem Description

You are given an integer array **A** of length **N**.\
You are also given a 2D integer array **B** with dimensions **M x 2**,
where each row denotes a `[L, R]` query.

For each query, you have to find the sum of all elements from L to R
indices in A (0 - indexed).\
More formally, find `A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R]`
for each query.

### Problem Constraints

    1 <= N, M <= 10^5
    1 <= A[i] <= 10^9
    0 <= L <= R < N

### Input Format

-   The first argument is the integer array **A**.\
-   The second argument is the 2D integer array **B**.

### Output Format

Return an integer array of length **M** where i-th element is the answer
for i-th query in B.

### Example Input

    Input 1:
    A = [1, 2, 3, 4, 5]
    B = [[0, 3], [1, 2]]

    Input 2:
    A = [2, 2, 2]
    B = [[0, 0], [1, 2]]

### Example Output

    Output 1:
    [10, 5]

    Output 2:
    [2, 4]

### Example Explanation

**Explanation 1:**\
The sum of all elements of `A[0 ... 3] = 1 + 2 + 3 + 4 = 10`.\
The sum of all elements of `A[1 ... 2] = 2 + 3 = 5`.

**Explanation 2:**\
The sum of all elements of `A[0 ... 0] = 2 = 2`.\
The sum of all elements of `A[1 ... 2] = 2 + 2 = 4`.

------------------------------------------------------------------------

## Q3. Sum of All Subarrays



### Problem Description

You are given an integer array **A** of length **N**.\
You have to find the sum of all subarray sums of A.

More formally, a subarray is defined as a contiguous part of an array
which we can obtain by deleting zero or more elements from either end of
the array.\
A subarray sum denotes the sum of all the elements of that subarray.

**Note:** Be careful of integer overflow issues while calculations. Use
appropriate datatypes.

### Problem Constraints

    1 <= N <= 10^5
    1 <= A[i] <= 10^4

### Input Format

The first argument is the integer array **A**.

### Output Format

Return a single integer denoting the sum of all subarray sums of the
given array.

### Example Input

    Input 1:
    A = [1, 2, 3]

    Input 2:
    A = [2, 1, 3]

### Example Output

    Output 1:
    20

    Output 2:
    19

### Example Explanation

**Explanation 1:**\
The different subarrays for the given array are:\
\[1\], \[2\], \[3\], \[1, 2\], \[2, 3\], \[1, 2, 3\].\
Their sums are: `1 + 2 + 3 + 3 + 5 + 6 = 20`.

**Explanation 2:**\
The different subarrays for the given array are:\
\[2\], \[1\], \[3\], \[2, 1\], \[1, 3\], \[2, 1, 3\].\
Their sums are: `2 + 1 + 3 + 3 + 4 + 6 = 19`.

------------------------------------------------------------------------

## Q4. Leaders in an array



### Problem Description

Given an integer array **A** containing **N** distinct integers, you
have to find all the leaders in array A.\
An element is a leader if it is strictly greater than all the elements
to its right side.

**NOTE:** The rightmost element is always a leader.

### Problem Constraints

    1 <= N <= 10^5
    1 <= A[i] <= 10^8

### Input Format

There is a single input argument which is an integer array **A**.

### Output Format

Return an integer array denoting all the leader elements of the array.

### Example Input

    Input 1:
    A = [16, 17, 4, 3, 5, 2]

    Input 2:
    A = [5, 4]

### Example Output

    Output 1:
    [17, 2, 5]

    Output 2:
    [5, 4]

### Example Explanation

**Explanation 1:**\
- Element 17 is strictly greater than all the elements on the right side
  to it.\
- Element 2 is strictly greater than all the elements on the right side
  to it.\
- Element 5 is strictly greater than all the elements on the right side
  to it.

So we will return these three elements i.e `[17, 2, 5]`, we can also
return `[2, 5, 17]` or `[5, 2, 17]` or any other ordering.

**Explanation 2:**\
- Element 5 is strictly greater than all the elements on the right side
  to it.\
- Element 4 is strictly greater than all the elements on the right side
  to it.

So we will return these two elements i.e `[5, 4]`, we can also return
any other ordering.
