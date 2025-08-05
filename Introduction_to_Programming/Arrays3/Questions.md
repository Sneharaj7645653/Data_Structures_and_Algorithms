
# Programming Problems

## Q1. Separate Odd Even

**Status:** Solved

### Problem Description
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.

You have to print the odd and even elements of array A in 2 separate lines.

**NOTE:** Array elements should have the same relative order as in A.

### Problem Constraints
```
1 <= T <= 10
1 <= |A| <= 10^5
1 <= A[i] <= 10^9
```

### Input Format
First line of the input contains a single integer T.

For each test case:
- First line consists of a single integer |A| denoting the length of array.
- Second line consists of |A| space separated integers denoting the elements of array A.

### Output Format
For each test case:
- First line should contain an array of space separated integers containing all the odd elements of array A
- Second line should contain an array of space separated integers containing all the even elements of array A

### Example Input
```
2 
5
1 2 3 4 5
3
4 3 2
```

### Example Output
```
1 3 5
2 4
3
4 2
```

### Example Explanation
Test Case 1: Odd elements: 1, 3, 5. Even elements: 2, 4.
Test Case 2: Odd elements: 3. Even elements: 4, 2.


---

## Q2. Print Unique Elements

**Status:** Solved

### Problem Description
You are given an integer T (Number of test cases). For each test case, you are provided with an integer array A.

Your task is to print the values that occur exactly once in the array. These values must be printed in ascending order.

To sort the array in ascending order, use `Arrays.sort()`.

### Problem Constraints
```
1 ≤ T ≤ 10
1 ≤ |A| ≤ 10^3
0 ≤ A[i] ≤ 10^3
```

### Input Format
The first line contains a single integer T — the number of test cases.

For each test case:
- The first integer is |A| (the length of the array).
- The next |A| integers are the elements of the array A.

### Output Format
For each test case, print on a separate line the elements that occur exactly once in the array, in ascending order.

### Example Input
```
2
10 1 2 3 5 1 5 20 2 12 10
5 3 2 1 0 0
```

### Example Output
```
3 10 12 20
1 2 3
```

### Example Explanation
Test Case 1: Values with exactly one occurrence: 3, 10, 12, 20.
Test Case 2: Values with exactly one occurrence: 1, 2, 3.


---

## Q3. Find Second Largest

**Status:** Solved

### Problem Description
Given an array A of integers of length N, write a program that efficiently finds the second largest element present in the array.

Your program should print:
- The second largest number
- `"NA"` if not applicable or not found

### Problem Constraints
```
1 <= N <= 10^5
-10^5 <= A[i] <= 10^5
```

### Input Format
First line of input consists of the integer N.
Second line consists of N space separated integers denoting the array.

### Output Format
Print the second largest number or `"NA"` if not possible.

### Example Input
```
3
1 2 3
```
```
1
1
```

### Example Output
```
2
NA
```

### Example Explanation
Example 1: The second largest element is 2.
Example 2: Only one element exists, so `"NA"`.


---

## Q4. Sum of Even and Odd Elements

**Status:** Solved

### Problem Description
Write a program to print sum of even elements and sum of odd elements of the input array A of size N.

The only line of the input would contain a single integer N followed by the N elements of the array.

### Problem Constraints
```
1 <= N <= 1000
1 <= A <= 1000
```

### Input Format
First line contains a single integer N followed by N elements of the array A.

### Output Format
A single line output containing two space-separated integers:
- First integer: Sum of even elements
- Second integer: Sum of odd elements

### Example Input
```
3 2 4 3
5 4 3 2 1 5
```

### Example Output
```
6 3
6 9
```

### Example Explanation
Example 1: Even elements: 2, 4 → sum = 6; Odd elements: 3 → sum = 3.
Example 2: Even elements: 4, 2 → sum = 6; Odd elements: 3, 1, 5 → sum = 9.






    