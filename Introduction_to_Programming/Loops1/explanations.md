
# 🔁 While Loops in Java — Explained with Fun! 😄

## 1️⃣ What is a While Loop?

A **`while`** loop is a control flow statement that allows code to be executed **repeatedly** based on a Boolean condition. As long as the condition is `true`, the loop continues to run.

🧠 **Syntax:**
```java
while (condition) {
    // code to be executed
}
```

📝 **Key Point:**
- The loop **checks the condition before** each iteration.
- If the condition is **true**, the code inside runs.
- If the condition is **false**, the loop ends. 🚪

---

## 2️⃣ Examples of While Loops

### 🔢 Example 1: Printing Numbers from 1 to 100
```java
int i = 1;
while (i <= 100) {
    System.out.println(i);
    i++;
}
```

📌 **Dry Run:**
- Start: `i = 1`
- Check: `i <= 100` → ✅ true
- Print and increment `i`
- Repeat until `i = 101` → ❌ false → loop stops

---

### 🔁 Example 2: Printing Numbers from 100 to 1
```java
int i = 100;
while (i >= 1) {
    System.out.println(i);
    i--;
}
```

📌 **Dry Run:**
- Start: `i = 100`
- Check: `i >= 1` → ✅
- Print and decrement `i` until `i = 0` → ❌ loop ends

---

### ⚖️ Example 3: Print Even Numbers from 1 to 100
```java
int i = 1;
while (i <= 100) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
    i++;
}
```

📌 **Dry Run:**
- Start: `i = 1`
- Check: `i % 2 == 0` → print only even numbers
- Increment `i` and repeat

---

## 3️⃣ Optimizing the Even Number Printing 🧠

Why check if a number is even every time when you can just **start from the first even number** and jump by 2s?

### ✅ Optimized Code:
```java
int i = 2;
while (i <= 100) {
    System.out.println(i);
    i += 2;
}
```

📌 **Dry Run:**
- Start: `i = 2`
- Print and increment by 2 → `i = 4, 6, 8...` until `i = 102`

✨ **Edge Case Fix:**
If `i` starts odd:
```java
if (i % 2 != 0) {
    i++;
}
```

---

## 4️⃣ Even Numbers in a User-Defined Range 🎯

📌 **Problem Statement:**  
Take two numbers `A` and `B` and print all even numbers between them (inclusive).

### 🧩 Code:
```java
import java.util.Scanner;

public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting value (A): ");
        int A = scanner.nextInt();
        System.out.print("Enter the ending value (B): ");
        int B = scanner.nextInt();

        if (A % 2 != 0) {
            A++; // make A even
        }

        while (A <= B) {
            System.out.println(A);
            A += 2;
        }

        scanner.close();
    }
}
```

💡 **Steps:**
1. Get inputs A and B
2. Make sure A starts from an even number
3. Use `while` to print even numbers, increasing A by 2

---

## 5️⃣ Check if a Number is Prime 🔍

📌 **Definition:**  
A prime number is greater than 1 and has only **two divisors**: 1 and itself.

### 🧩 Code:
```java
int num = 29;
int count = 0;
int i = 1;

while (i <= num) {
    if (num % i == 0) {
        count++;
    }
    i++;
}

if (count == 2) {
    System.out.println(num + " is a prime number.");
} else {
    System.out.println(num + " is not a prime number.");
}
```

📌 **Dry Run (for 29):**
- Count how many numbers divide 29 exactly
- Only 1 and 29 → count = 2 → ✅ Prime!

⚠️ **For Non-Prime (e.g., 28):**  
Count will be more than 2 → ❌ Not Prime

---

📘 **Summary:**
- While loops are powerful for repeating tasks under a condition ✅
- Optimize loops for efficiency 🔧
- Use them to solve real problems like even number generation and primality testing 🚀  
