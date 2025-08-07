
# Array Practice Problems: Sorting, Reversing, and Rotating

## Q1. Count Swaps in Insertion Sort - II ✅

### Problem Description
Given an integer array `A` of size `N`, sort the elements in increasing order using **Insertion Sort**.  
Return the total number of **shifts/swaps** done.

### Constraints
- 1 <= N <= 10³
- 1 <= A[i] <= 10⁹

### Input Format
Single integer array A.

### Output Format
Return an integer denoting the number of swaps.

### Example Input
**Input 1:**  
`A = [5, 3, 1, 9, 4]`  
**Input 2:**  
`A = [2, 10, 4, 11]`

### Example Output
**Output 1:** `5`  
**Output 2:** `1`

### Explanation
- Input 1 requires 5 swaps to become sorted.
- Input 2 only needs 1 swap.

---

## Q2. Check if Array is Sorted ✅

### Problem Description
Check if an array `A` is sorted in **non-decreasing** order.

### Constraints
- 1 <= A[i] <= 10⁹
- 1 <= |A| <= 10⁵

### Input Format
Single integer array A.

### Output Format
Return `1` if sorted, else return `0`.

### Example Input
**Input 1:** `A = [1, 2, 2]`  
**Input 2:** `A = [1, 2, 1]`

### Example Output
**Output 1:** `1`  
**Output 2:** `0`

### Explanation
- First input is in non-decreasing order.
- Second input has a drop (2 > 1), so it is not sorted.

---

## Q3. Reverse Part Of Array ✅

### Problem Description
Given array `A[]`, starting index `B` and ending index `C`, reverse the array from index B to C.  
Note: Changes must be made **in-place**.

### Constraints
- 0 < A.length <= 10,000
- -100000 <= A[i] <= 100000
- 0 <= B, C < A.length
- B <= C

### Input Format
Three arguments: A, B, and C.

### Output Format
Return the modified array after reversing A[B:C+1].

### Example Input
**Input 1:**  
A = `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`, B = 2, C = 7

**Input 2:**  
A = `[10, 20, 30, 40, 50, 60, 70, 80]`, B = 2, C = 5

### Example Output
**Output 1:** `[1, 2, 8, 7, 6, 5, 4, 3, 9, 10]`  
**Output 2:** `[10, 20, 60, 50, 40, 30, 70, 80]`

---

## Q4. Left Rotate Array ✅

### Problem Description
You are given an array and need to perform **left rotation by two positions**.

### Input Format
Single array A.

### Output Format
Return the modified array after rotation.

### Example Input
**Input 1:** `[1, 2, 3, 4, 5]`  
**Input 2:** `[9, 8, 7, 6, 5, 4, 3, 2, 1]`

### Example Output
**Output 1:** `[3, 4, 5, 1, 2]`  
**Output 2:** `[7, 6, 5, 4, 3, 2, 1, 9, 8]`

---

**Practice Tip:** Try dry runs on paper to visualize array transformations and swaps before coding them.
