# Factorials and Related Concepts

## 1. Introduction to Factorials

### Definition
A factorial of a non-negative integer $n$, denoted as $n!$, is the product of all positive integers less than or equal to $n$.

$n! = 1 \times 2 \times 3 \times \cdots \times n$

For example, $5! = 1 \times 2 \times 3 \times 4 \times 5 = 120$.

### Example Calculation
Calculate 5!:
```python
def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

print(factorial(5)) # Output: 120
```

## 2. Edge Cases and Overflow in Factorials

### Edge Cases
Factorials grow very rapidly, so they can easily exceed typical integer limits in computing. For example, 20! exceeds the range of a standard 32-bit integer.

### Overflow
Integer Overflow occurs when a calculation produces a value greater than that which can be stored within the available number of bits.

**Avoiding Overflow:** Use data types with larger capacity (e.g., using long instead of int in languages like Java).

### Example
Given a task to compute n! for n ≤ 20, ensure data type sufficiency:
```python
def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

n = 20
print(factorial(n)) # Output needs a data type that can handle large numbers
```

## 3. Counting Trailing Zeros in Factorials

### Problem Definition
Given a number n, determine how many trailing zeros are in n!.

### Trailing Zeros Explanation
Trailing zeros are produced by the factors 10 in the number.

A 10 is produced by multiplying 2 and 5. In the factorial breakdown, there are plenty of 2s but the number of 5s is limited.

### Algorithm to Count Trailing Zeros
Count how many times 5 is a factor in numbers from 1 to n.

Sum up counts, including multiple counts for numbers like 25 (which have 5^2).

### Pseudocode
```python
def count_trailing_zeros(n):
    count = 0
    i = 5
    while (n // i >= 1):
        count += n // i
        i *= 5
    return count

print(count_trailing_zeros(100))  # Output: 24
```
For n = 100, repeatedly dividing by 5, 25, etc., accounts for all factors of 5.

## 4. Algorithm Optimization with Logarithms

### Logarithmic Steps
Logarithmic Complexity: For operations reducing problem size exponentially, the number of steps is logarithmic.

Example: Dividing n by 5 in each step until n is smaller than 5 leads to log base 5 of n steps.

### Importance of Logarithms in Algorithms
Logarithmic steps are efficient, making these solutions preferable for handling large inputs.

Examples include divide-and-conquer algorithms like binary search.

## 5. Dry Run Techniques for Code

### What is a Dry Run?
Dry Run: Manually executing code line by line to track variable values and logic flow.

**Purpose:** Identifies logical errors, boundary cases, and checks expected results.

### How to Perform a Dry Run
- **Initialize Variables:** Track all variables that change.
- **Step by Step Execution:** Follow through each loop and conditional.
- **Record Changes:** Note how each variable updates at every step.

### Example Dry Run
Consider the function:
```python
def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result
```
For n = 5, values change as follows:
- i = 1, result = 1
- i = 2, result = 1 * 2 = 2
- i = 3, result = 2 * 3 = 6
- i = 4, result = 6 * 4 = 24
- i = 5, result = 24 * 5 = 120

### Importance of Dry Runs
Essential for debugging and ensuring code robustness, especially for complex algorithms.
