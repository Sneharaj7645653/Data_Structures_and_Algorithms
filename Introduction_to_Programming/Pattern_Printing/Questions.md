# Pattern Printing Questions

## Q1. Hollow Pyramid Pattern

### Problem Description
Take an integer `N` as input, print the corresponding pattern for `N`.

Example for `N = 5`:

```
********** // 0 spaces
****  **** // 2 spaces
***    *** // 4 spaces
**      ** // 6 spaces
*        * // 8 spaces
```

> Note: Here spaces are represented with `_` for clarity in the description. You must print actual spaces in your code.

### Problem Constraints
```
2 <= N <= 100
```

### Input Format
First and only line of input contains a single integer `N`.

### Output Format
Output the full pyramid pattern corresponding to the given `N`.

### Example Input
```
Input 1:
2

Input 2:
3
```

### Example Output
```
Output 1:
****
*  *

Output 2:
******
**  **
*    *
```

---

## Q2. Hollow Inverted Pyramid Pattern

### Problem Description
Take an integer `N` as input, print the corresponding pattern for `N`.

Example for `N = 5`:

```
*        * // 8 spaces
**      ** // 6 spaces
***    *** // 4 spaces
****  **** // 2 spaces
********** // 0 spaces
```

> Note: Here spaces are represented with `_` for clarity in the description. You must print actual spaces in your code.

### Problem Constraints
```
2 <= N <= 100
```

### Input Format
First and only line of input contains a single integer `N`.

### Output Format
Output the inverted pyramid pattern corresponding to the given `N`.

### Example Input
```
Input 1:
2

Input 2:
3
```

### Example Output
```
Output 1:
*  *
****

Output 2:
*    *
**  **
******
```

---

## Q3. Leading Spaces Inverted Pyramid

### Problem Description
Take an integer `N` as input, print the corresponding pattern for `N`.

Example for `N = 5`:

```
*****
 ****
  ***
   **
    *
```

> Note: Here spaces are represented with `_` for clarity in the description. You must print actual spaces in your code.

### Problem Constraints
```
1 <= N <= 100
```

### Input Format
First and only line of input contains a single integer `N`.

### Output Format
Output the pattern corresponding to the given `N`.

### Example Input
```
Input 1:
2

Input 2:
3
```

### Example Output
```
Output 1:
**
 *

Output 2:
***
 **
  *
```

---

## Summary
- **Q1:** Hollow pyramid with decreasing stars and increasing middle spaces.
- **Q2:** Reverse of Q1 — hollow inverted pyramid.
- **Q3:** Inverted pyramid with leading spaces.
