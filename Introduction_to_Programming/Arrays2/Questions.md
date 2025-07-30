# Problem Set

## Q1. Sum of Array Elements

**Problem Description**  
Write a program to print sum of elements of the input array `A` of size `N`.

**Note:** User is supposed to write a program from scratch to add the elements of the input array and print the result.

### Problem Constraints
```
1 <= N <= 1000
1 <= A <= 1000
```

### Input Format
- The first integer `N` denotes the number of integers in the array.
- The next `N` integers denote the elements of the array `A`.

### Output Format
A single integer containing sum of elements from the input array.

### Example Input
```
5 1 2 3 4 5
```
```
4 10 50 40 80
```

### Example Output
```
15
```
```
180
```

---

## Q2. Average Rainfall

**Problem Description**  
Create an array of size `N`, which can store rainfall size for `N` days.  
Take rainfall measurement for `N` days from user and print floor of average rainfall for `N` days.

**Note:**
1. Rainfall measurement is non-decimal number.
2. For Floor of number use `Math.Floor(NUM)` function.
3. `Average = (Sum of entries) / (number of entries)`.

### Problem Constraints
```
0 < N <= 10000
0 <= arr[i] <= 50
```

### Input Format
1. First argument: `N` as size of array.
2. Next `N` entries: rainfall measurements.

### Output Format
Print floor of average rainfall in single line.

### Example Input
```
10
12 26 25 21 18 10 45 40 29 30
```
```
12
12 28 23 21 18 15 14 40 12 30 10 19
```

### Example Output
```
25
```
```
20
```

---

## Q3. Print in Reverse

**Problem Description**  
Write a program to print the input array `A` of size `N` in reverse order.

### Problem Constraints
```
1 <= N <= 1000
1 <= A <= 1000
```

### Example Input
```
5 1 2 3 4 5
```
```
4 10 50 40 80
```

### Example Output
```
5 4 3 2 1 
```
```
80 40 50 10 
```

---

## Q4. Negative Integers

**Problem Description**  
Write a program to print all negative numbers from input array `A` of size `N`.

### Problem Constraints
```
1 <= N <= 1000
-1000 <= A <= 1000
```

### Example Input
```
5 1 -5 2 -8 -4
```
```
4 -1 0 -8 -1
```

### Example Output
```
-5 -8 -4 
```
```
-1 -8 -1 
```

---

## Q5. Inverted Half Pyramid

**Problem Description**  
Given an integer `N`, print the corresponding Inverted Half Pyramid pattern.

### Problem Constraints
```
1 <= N <= 100
```

### Example Input
```
3
```
### Example Output
```
***
**
*
```

---

## Q6. Hollow Inverted Half Pyramid

**Problem Description**  
Given an integer `N` as input, print the corresponding Hollow Inverted Half Pyramid pattern.

### Problem Constraints
```
1 <= N <= 100
```

### Example Input
```
4
```
### Example Output
```
****
* *
**
*
```

---

## Q7. Search Element

**Problem Description**  
You are given `T` test cases. For each array `A` and integer `B`, check if `B` is present in `A`.

### Problem Constraints
```
1 <= T <= 10
1 <= A <= 10^5
1 <= A[i], B <= 10^9
```

### Example Input
```
1
5
4 1 5 9 1
5
```

### Example Output
```
1
```

---

## Q8. Even Odd Elements

**Problem Description**  
You are given `T` integer arrays. For each array `A`, find the absolute difference between counts of even and odd elements.

### Problem Constraints
```
1 <= T <= 10
1 <= |A| <= 10^5
1 <= A[i] <= 10^9
```

### Example Input
```
1
4 1 2 3 4
```

### Example Output
```
0
```
