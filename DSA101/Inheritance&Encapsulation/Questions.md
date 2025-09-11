# OOP Practice Problems

## Q1. Rectangle Class
**Solved**  
*feature icon*  
*Using hints except Complete Solution is Penalty free now*  
*Use Hint*

### Problem Description
Given N rectangles with their length and breadth in array A and B.

Create a class `Rectangle` that supports the following functionalities:

1. Check if the given rectangle is a square.
2. Find area of the rectangle.
3. Check if the area is greater than K (K is passed as parameter in the function).
4. Use this class to answer this question - Find the count of squares on the left with area greater than current rectangle area for all rectangles.

### Problem Constraints
- 1 <= N <= 10³
- 1 <= A[i] <= 10³
- 1 <= B[i] <= 10³

### Input Format
The two arguments A and B are integer arrays that denote the length and breadth of the N rectangles respectively.

### Output Format
Return an integer array where each element denotes the count of squares on the left with area greater than current rectangle area.

### Example Input
**Input 1:**
```
A = [4, 6, 7]
B = [4, 6, 2]
```  
**Input 2:**
```
A = [2, 5, 3, 6, 2]
B = [4, 5, 1, 6, 2]
```  

### Example Output
**Output 1:**
```
[0, 0, 2]
```  
**Output 2:**
```
[0, 0, 1, 0, 2]
```  

### Example Explanation
**Explanation 1:**  
The area of rectangles are [16, 36, 14]. Of them 1st and 2nd are squares.

**Explanation 2:**  
The area of rectangles are [8, 25, 3, 36, 4]. Of them only 2nd and 4th are squares.

---

## Q2. Class Fraction
**Solved**  
*feature icon*  
*Using hints except Complete Solution is Penalty free now*  
*Use Hint*

### Problem Description
Construct a class `Fraction` which stores a fraction. It should contain:

- Numerator
- Denominator

Assume denominator will never be 0.

The class should support the following functionalities:

- `add(Fraction)` -> Returns the sum of two fractions
- `subtract(Fraction)` -> Returns the difference of two fractions
- `multiply(Fraction)` -> Returns the product of two fractions

The fraction returned needs to be in the simplest form. If the fraction is p/q then p and q must be co-prime.

You may define any properties in the class as you see appropriate.

---

## Q3. Class Complex Number
**Solved**  
*feature icon*  
*Using hints except Complete Solution is Penalty free now*  
*Use Hint*

### Problem Description
Construct a class called `ComplexNumber` which stores two properties:

- `real` - The real part
- `imaginary` - The imaginary part

The name of the properties should be strictly `real` and `imaginary`.

Implement the following functionalities inside this class:

- `add(ComplexNumber)` -> Returns an object of ComplexNumber having sum of the two complex numbers.
- `subtract(ComplexNumber)` -> Returns an object of ComplexNumber having difference of the two complex numbers.
- `multiply(ComplexNumber)` -> Returns an object of ComplexNumber having multiplication of the two complex numbers.
- `divide(ComplexNumber)` -> Returns an object of ComplexNumber having division of the two complex numbers.  
