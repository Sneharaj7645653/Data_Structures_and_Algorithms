# Comprehensive Revision Notes: Time and Space Complexity

## Introduction
Time and space complexity are measures used to evaluate the efficiency of algorithms.
- **Time Complexity**: Measures how the runtime of an algorithm grows with input size.
- **Space Complexity**: Measures how much memory an algorithm uses as the input size grows.

---

## Time Complexity

### Big-O Notation
- **O(1)**: Constant time — runtime does not depend on input size.  
  Example: Accessing an element in an array.

- **O(log n)**: Logarithmic time — runtime grows slowly as input increases.  
  Example: Binary search.

- **O(n)**: Linear time — runtime grows proportionally with input size.  
  Example: Traversing an array.

- **O(n log n)**: Log-linear time — common in efficient sorting algorithms.  
  Example: Merge sort, quicksort (average case).

- **O(n²)**: Quadratic time — common in algorithms with nested loops.  
  Example: Bubble sort, insertion sort (worst case).

- **O(2^n)**: Exponential time — grows very fast; inefficient for large inputs.  
  Example: Recursive Fibonacci without memoization.

- **O(n!)**: Factorial time — extremely inefficient, grows faster than exponential.  
  Example: Generating all permutations of a set.

---

## Space Complexity

### Types of Space Usage
1. **Fixed Part**: Independent of input size (e.g., constants, program code).
2. **Variable Part**: Depends on input size (e.g., dynamic memory, recursion stack).

### Examples
- **O(1)**: Constant space — algorithm uses the same amount of memory regardless of input.  
  Example: Swapping two numbers.

- **O(n)**: Linear space — memory grows with input size.  
  Example: Storing an array of `n` elements.

- **O(n²)**: Quadratic space — memory grows with square of input size.  
  Example: 2D matrix of size `n × n`.

---

## Trade-Off Between Time and Space
- Sometimes, more memory can reduce time complexity (e.g., using hash tables).
- Conversely, optimizing for less space can increase time (e.g., recomputation instead of storing results).

---

## Key Points to Remember
- **Best Case, Worst Case, Average Case**: Different scenarios for analyzing runtime.
- **Asymptotic Analysis**: Focuses on growth rate, ignoring constants and lower-order terms.
- **Practical Consideration**: Balance between time and space depends on the problem and system constraints.  
