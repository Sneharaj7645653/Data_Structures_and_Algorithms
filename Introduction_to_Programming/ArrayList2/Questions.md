# Matrix Problems

## Q2. Even elements from every row

**Problem Description**  
You are given a 2D integer matrix A, Return a 2D Dynamic Array containing even numbers of every row in A.

**Note**:
- In JAVA: Dynamic Array is ArrayList
- In C++: Dynamic Array is vector
- In Python: Dynamic Array is List

**Problem Constraints**
```
1 <= A.length <= 10^3
1 <= A[i].length <= 10^3
1 <= A[i][j] <= 10^3
```

**Input Format**  
First and only argument A is a 2D Dynamic Array of integers (2D matrix).

**Output Format**  
Return a 2D Dynamic Array containing row-wise even numbers of the original matrix.

**Example Input**
```
Input 1:
A = [[1,2,3,4],
     [5,6,7,8],
     [9,4,3,5]]

Input 2:
A = [[10, 30],
     [11, 13]]
```

**Example Output**
```
Output 1:
[[2, 4],
 [6, 8], 
 [4]]

Output 2:
[[10, 30],
 []]
```

**Example Explanation**
- For Input 1:  
  1st row even elements = 2, 4  
  2nd row even elements = 6, 8  
  3rd row even elements = 4

- For Input 2:  
  1st row even elements = 10, 30  
  There are no even elements in the 2nd row.

---

## Q3. Major diagonal in Matrix

**Problem Description**  
You are given a N X N integer matrix A. You have to return an array of major/main diagonal elements of A.

Major diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

**Problem Constraints**
```
1 <= N <= 10^3
-1000 <= A[i][j] <= 1000
```

**Input Format**  
First and only argument A is a 2D array of integers (2D matrix).

**Output Format**  
Return 1D Integer Array.

**Example Input**
```
Input 1:
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

Input 2:
A = [[10, 90],
     [65, 87]]
```

**Example Output**
```
Output 1:
[1, 5, 9]

Output 2:
[10, 87]
```

**Example Explanation**
- For Input 1:  
  Major diagonal elements are:  
  A[0][0] = 1  
  A[1][1] = 5  
  A[2][2] = 9

- For Input 2:  
  Major diagonal elements are:  
  A[0][0] = 10  
  A[1][1] = 87

---

## Q4. Print Matrix Diagonal

**Problem Description**  
Given a matrix A of size NxM, Traverse the matrix diagonally from top to bottom starting bottom left diagonal and return the traversal as an array of integers.

**Note**:
- 1st diagonal is A[N-1][0]
- 2nd diagonal is A[N-2][0] to A[1][N-1]
- ...
- Last diagonal is A[0][M-1]

**Problem Constraints**
```
1 <= N <= 10^3
1 <= A[i][j] <= 10^5
```

**Input Format**  
First line contains N, M  
Next N lines contain M integers separated by space.

**Output Format**  
Print one line containing diagonal traversal.

**Example Input**
```
Input 1:
3 3
1 2 3
4 5 6
7 8 9

Input 2:
2 2
9 5
7 8
```

**Example Output**
```
Output 1:
7 4 8 1 5 9 2 6 3

Output 2:
7 9 8 5
```

**Example Explanation**
- For Input 1:  
  Diagonals from top to bottom are:  
  7  
  4, 8  
  1, 5, 9  
  2, 6  
  3

- For Input 2:  
  Diagonals from top to bottom are:  
  7  
  9, 8  
  5
