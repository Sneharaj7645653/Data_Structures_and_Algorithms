# Dynamic Array Problems

## Q1. All Even Numbers
**Problem Description:**  
Given a dynamic array `A`. Return a Dynamic Array that has all even numbers from `A`.

**Note:**
- Dynamic Array in JAVA: `ArrayList`
- Dynamic Array in C++: `vector`
- Dynamic Array in Python: `list`

**Constraints:**
```
0 < A.length <= 10000
-100000 <= A[i] <= 100000
```

**Input Format:**  
Single Argument integer dynamic array `A[]`.

**Output Format:**  
Return Integer Dynamic Array of all even numbers.

**Example Input:**
```
Input 1: A[] : 8 54 79 62 33 59 14 19 20 27
Input 2: A[] : 31 38 36 45 48 47 44 26
```

**Example Output:**
```
Output 1: 8 54 62 14 20
Output 2: 38 36 48 44 26
```

**Example Explanation:**  
For `Input 1`, even elements are: `8 54 62 14 20`.  
For `Input 2`, even elements are: `38 36 48 44 26`.

---

## Q2. All Odd Numbers
**Problem Description:**  
Given a Dynamic Array `A`. Return a Dynamic Array which has all odd numbers from the given list.

**Note:**
- JAVA: `ArrayList`
- C++: `vector`
- Python: `list`

**Constraints:**
```
0 < Size of A <= 10000
-100000 <= A[i] <= 100000
```

**Input Format:**  
Single Argument Dynamic Array of Integer `A`.

**Output Format:**  
Return the Dynamic Array of all odd numbers.

**Example Input:**
```
Input 1: List: 8 54 79 62 33 59 14 19 20 27
Input 2: List: 31 38 36 45 48 47 44 26
```

**Example Output:**
```
Output 1: 79 33 59 19 27
Output 2: 31 45 47
```

**Example Explanation:**  
For `Input 1`, odd elements are: `79 33 59 19 27`.  
For `Input 2`, odd elements are: `31 45 47`.

---

## Q3. All Unique Elements
**Problem Description:**  
Given a dynamic Array `A`. Return a dynamic Array which has All Unique Elements from the given Array.

**Note:**
- JAVA: `ArrayList`
- C++: `vector`
- Python: `list`

**Constraints:**
```
1 <= A.size() <= 1000
-100000 <= A[i] <= 100000
```

**Input Format:**  
Single Argument `A` is a Dynamic Array of Integer.

**Output Format:**  
Return Integer Dynamic Array of all unique numbers.

**Example Input:**
```
Input 1: [8, 54, 79, 62, 33, 59, 14, 8, 20, 27, 33, 54]
Input 2: [31, 38, 36, 45, 48, 47, 44, 26, 31, 45]
```

**Example Output:**
```
Output 1: [79, 62, 59, 14, 20, 27]
Output 2: [38, 36, 48, 47, 44, 26]
```

**Example Explanation:**  
For `Input 1`, unique elements are: `[79, 62, 59, 14, 20, 27]`.  
For `Input 2`, unique elements are: `[38, 36, 48, 47, 44, 26]`.

---

## Q4. All Unique Elements - Increasing Order
**Problem Description:**  
Given a Dynamic Array `A`. Create a Dynamic Array that has all Unique elements from the given Array.  
Sort the created Array in non-decreasing order and return the sorted Array.

**Note:**
1. You can sort Array using the inbuilt function.
2. JAVA: `ArrayList`  
   Python: `list`  
   C++: `vector`

**Constraints:**
```
0 < A.size() <= 1000
-100000 <= A.get(i) <= 100000
```

**Input Format:**  
Single Argument `A` which is Dynamic Array of Integer.

**Output Format:**  
Return Sorted Dynamic Array which have all unique numbers.

**Example Input:**
```
Input 1: [8 54 79 62 33 59 14 8 20 27 33 54]
Input 2: [31 38 36 45 48 47 44 26 31 45]
```

**Example Output:**
```
Output 1: 14 20 27 59 62 79
Output 2: 26 36 38 44 47 48
```

**Example Explanation:**  
For `Input 1`, unique elements: `79 62 59 14 20 27`, sorted: `14 20 27 59 62 79`.  
For `Input 2`, unique elements: `38 36 48 47 44 26`, sorted: `26 36 38 44 47 48`.

---
