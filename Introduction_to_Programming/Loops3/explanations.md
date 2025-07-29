
# 📘 Revision Notes for GCD Calculation Class

## 🧠 Introduction
In this class, the primary focus was on understanding and implementing the concept of **Greatest Common Divisor (GCD)** using loops in the programming context. The GCD of two numbers is the largest number that can divide both of them without leaving a remainder.

## 📌 Concept of GCD
**Definition:** The greatest common divisor (GCD) of two or more integers, which are not all zero, is the largest positive integer that divides each of the integers.

**Example:** GCD of 12 and 18 is 6.

### ✅ Properties:
- GCD of a number with zero is the number itself. Example: `GCD(30, 0) = 30`
- GCD of a number with 1 is always 1. Example: `GCD(15, 1) = 1`
- GCD can be negative, but we generally take the absolute value for simplicity.

## 🛠️ Methods to Calculate GCD

### 🔁 Iterative Method

**Steps:**
1. Iterate from 1 to the minimum of the two numbers.
2. For each number in this range, check if it divides both numbers.
3. Keep track of the largest number that divides both, which will be the GCD.

**Code Implementation:**

```java
public static int findGCD(int a, int b) {
    int gcd = 1;
    for (int i = 1; i <= Math.min(a, b); i++) {
        if (a % i == 0 && b % i == 0) {
            gcd = i;
        }
    }
    return gcd;
}
```

### ⚡ Optimized Iterative Method

- Instead of iterating from 1 up to the minimum of the two numbers, iterate from the minimum down to 1.
- The first number found that divides both is the GCD.

**Code Implementation:**

```java
public static int findGCD(int a, int b) {
    for (int i = Math.min(a, b); i >= 1; i--) {
        if (a % i == 0 && b % i == 0) {
            return i;
        }
    }
    return 1; // technically won’t get executed for positive integers
}
```

## 🔍 Dry Run Example

**Let's perform a dry run for `findGCD(12, 18)`:**

- Initialize gcd to 1.
- Iterate from 1 to the minimum of 12 and 18, which is 12.
- Check each number:
    - ✅ 1 divides both.
    - ✅ 2 divides both.
    - ✅ 3 divides both.
    - ❌ 4 does not divide 18.
    - ❌ 5 does not divide either.
    - ✅ 6 divides both.
- ✅ Found 6 as GCD.

## 🔄 Loop Structures in GCD Calculation

### `while` Loop:

```java
int i = 1;
while (i <= min(a, b)) {
    if (a % i == 0 && b % i == 0) {
        gcd = i;
    }
    i++;
}
```

### `for` Loop:

```java
for (int i = 1; i <= Math.min(a, b); i++) {
    if (a % i == 0 && b % i == 0) {
        gcd = i;
    }
}
```

📝 This ensures the initialization, condition and update are all in one place and less prone to errors compared to while loops.

## ⚠️ Common Errors and Considerations
- **Scope of Variables:** Ensure variables meant to be used outside the for/while loop are declared outside.
- **Increment/Decrement:** Be cautious with incrementing or decrementing the loop variable correctly.
- **Break Statement:** A `break` can be used to exit the loop as soon as the required condition is met.

## 🧩 Example Problems
- **GCD of 18 and 12:** ✅ The GCD is 6.
- **GCD of 7 and 13:** 🟡 As they are co-prime, the GCD is 1.

## 🔗 Extension: Co-Prime Numbers
**Definition:** Two numbers are co-prime if their GCD is 1.

**Example:** `12` and `49` are co-prime as their GCD is 1.

## 🧾 Summary
In conclusion, understanding and implementing loops correctly is crucial in calculating the GCD of two numbers. By iterating through possible divisors and keeping track of the largest number that divides both, one can determine the GCD effectively. Additionally, special properties and edge cases like handling zero and co-prime numbers enhance the comprehension of the concept.


By having a structured approach and carefully managing loop variables, calculating the GCD becomes a systematic process.
