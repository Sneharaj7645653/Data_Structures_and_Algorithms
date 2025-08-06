# Table of Contents

1. [Introduction](#introduction)
2. [Concept of Loops in Pattern Printing](#concept-of-loops-in-pattern-printing)
3. [Star Patterns](#star-patterns)
    - [Simple Right-Angled Triangle](#simple-right-angled-triangle)
    - [Inverted Triangle](#inverted-triangle)
    - [Pyramid of Spaces and Stars](#pyramid-of-spaces-and-stars)
4. [Combination Patterns](#combination-patterns)
5. [Number Inclusion Patterns](#number-inclusion-patterns)
6. [Advanced Patterns](#advanced-patterns)
7. [Pattern Analysis and Strategy](#pattern-analysis-and-strategy)
8. [Conclusion](#conclusion)

---

## Introduction
Pattern printing is a fundamental concept in programming where we use nested loops to generate specific patterns using characters, numbers, or symbols. This session focuses on various patterns and the logical breakdown to create them using loops.

## Concept of Loops in Pattern Printing
The creation of patterns primarily involves two types of loops:

- **Outer Loop:** Controls the number of lines (or rows) in the pattern.
- **Inner Loop:** Controls the contents of each line, including spaces and stars.

---

## Star Patterns

### Simple Right-Angled Triangle
**Description:** A pattern where each line contains an increasing number of stars starting from the first line with one star.

Example (for n=5):
```
*
* *
* * *
* * * *
* * * * *
```

**Code:**
```python
n = 5
for i in range(1, n+1):
    for j in range(i):
        print("*", end=" ")
    print()
```

**Explanation:**
- Outer loop runs `n` times.
- Inner loop runs `i` times to print stars.

---

### Inverted Triangle
**Description:** A pattern where each line contains a decreasing number of stars starting from `n` stars.

Example (for n=5):
```
* * * * *
* * * *
* * *
* *
*
```

**Code:**
```python
n = 5
for i in range(n):
    for j in range(n-i):
        print("*", end=" ")
    print()
```

**Explanation:**
- Outer loop runs `n` times.
- Inner loop runs `n-i` times.

---

### Pyramid of Spaces and Stars
**Description:** Stars form a pyramid, with spaces decreasing and stars increasing.

Example (for n=5):
```
    *
   * *
  * * *
 * * * *
* * * * *
```

**Code:**
```python
n = 5
for i in range(1, n+1):
    for j in range(n-i):
        print(" ", end=" ")
    for k in range(i):
        print("*", end=" ")
    print()
```

---

## Combination Patterns
**Description:** Patterns divided into sections with different logic.

Example:
```python
n = 5
# First part: Pyramid
for i in range(1, n+1):
    print(" " * (n-i) + "* " * i)

# Second part: Inverted Pyramid
for i in range(n-1, 0, -1):
    print(" " * (n-i) + "* " * i)
```

---

## Number Inclusion Patterns
**Description:** Patterns that include numbers and stars.

Example:
```
1
* 2
** 3
*** 4
**** 5
```

**Code:**
```python
n = 5
for i in range(1, n+1):
    print("*" * (i-1) + str(i))
```

---

## Advanced Patterns

### Hollow Diamond with Star
Example for n=5:

Upper Part:
```python
n = 5
for i in range(n):
    for j in range(i):
        print(" ", end="")
    for k in range(2*(n-i)-1):
        if k == 0 or k == 2*(n-i)-2:
            print("*", end="")
        else:
            print(" ", end="")
    print()
```

Lower Part:
```python
for i in range(n-2, -1, -1):
    for j in range(i):
        print(" ", end="")
    for k in range(2*(n-i)-1):
        if k == 0 or k == 2*(n-i)-2:
            print("*", end="")
        else:
            print(" ", end="")
    print()
```

---

## Pattern Analysis and Strategy
- Analyze the pattern row by row.
- Determine how stars and spaces change.
- Implement using nested loops.

---

## Conclusion
Pattern printing helps understand loops and control flow. Break patterns into smaller sections, observe relationships between rows and columns, and use nested loops effectively.
