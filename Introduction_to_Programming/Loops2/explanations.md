
# 🧠 Revision Notes

---

## 1️⃣ Optimizing Prime Number Check

### 🧾 Problem Recap:
In the previous class, we checked if a number is prime by iterating through all numbers from 1 to N.  
This required N iterations, which is inefficient for large numbers.

---

### 🔹 Step 1: Reduce Iterations to N/2

> The largest factor of a number N (other than N itself) is N/2.  
Thus, we can reduce the iterations to check factors only up to N/2.

```java
int N = 29;
boolean isPrime = true;
int factor = 2;

while (factor <= N / 2) {
    if (N % factor == 0) {
        isPrime = false;
        break;
    }
    factor = factor + 1;
}

if (isPrime) {
    System.out.println(N + " is a prime number.");
} else {
    System.out.println(N + " is not a prime number.");
}
```

🔍 **Explanation:** We now iterate only from 2 to N/2. If any number divides N, then N is not a prime number.

---

### 🔹 Step 2: Reduce Iterations to √N

> Factors of a number N occur in pairs.  
If `a` is a factor of `N`, then `N/a` is also a factor.  
So, we only need to check up to `√N`.

```java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int N = 29;
        boolean isPrime = true;
        int factor = 2;

        while (factor * factor <= N) {
            if (N % factor == 0) {
                isPrime = false;
                break;
            }
            factor = factor + 1;
        }

        if (isPrime) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }
    }
}
```

✅ **Explanation:** This drastically reduces iterations using `factor * factor <= N`.

---

## 2️⃣ Sum of All Digits of a Given Number

### 🧾 Problem Recap:
Given a number N, compute the sum of all its digits using `%` and `/`.

```java
int N = 12345;
int sum = 0;

while (N > 0) {
    int digit = N % 10; // Extract the last digit
    sum = sum + digit;  // Add it to sum
    N = N / 10;         // Remove the last digit
}

System.out.println("Sum of digits: " + sum);
```

### 🔍 Explanation:
- `% 10` gets the last digit.
- Add to `sum`.
- `/ 10` removes the last digit.

---

### ❗ Common Error: Infinite Loop with `N >= 0`

```java
while (N >= 0) {
    int digit = N % 10;
    sum += digit;
    N = N / 10;
}
```

🛑 **Dry Run:**
- When `N = 0`, the loop continues infinitely because `0 >= 0` is true.

✅ **Key Takeaway:** Use `N > 0` to stop when all digits are processed.

---

## 3️⃣ Reverse a Number and Double It

### 🧾 Problem Recap:
Given a number N, reverse its digits and double the reversed number.

```java
int N = 12345;
int reversed = 0;

while (N > 0) {
    int digit = N % 10;
    reversed = reversed * 10 + digit;
    N = N / 10;
}

int doubledReversed = reversed * 2;
System.out.println("Reversed number: " + reversed);
System.out.println("Doubled reversed number: " + doubledReversed);
```

---

### 🔍 Dry Run of Reversing 12345

- **1st:** N = 12345 → digit = 5 → reversed = 5 → N = 1234
- **2nd:** digit = 4 → reversed = 54 → N = 123
- **3rd:** digit = 3 → reversed = 543 → N = 12
- **4th:** digit = 2 → reversed = 5432 → N = 1
- **5th:** digit = 1 → reversed = 54321 → N = 0
- **Double:** 54321 × 2 = 108642

---

## 🧾 Conclusion

- ✅ **Prime Optimization:** Reduced from O(N) → O(N/2) → O(√N)
- ✅ **Sum of Digits:** Loop conditions matter; avoid infinite loops.
- ✅ **Reversing & Doubling:** Efficient use of `%` and `/` without digit count.
