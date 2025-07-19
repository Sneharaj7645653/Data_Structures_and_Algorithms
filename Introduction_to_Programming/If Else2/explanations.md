
# 🧠 Revision Notes: Software Engineering Class on If-Else and Modulus Operator

## 📋 Overview
In this class, the instructor detailed the principles of using the modulus operator, the logical constructions facilitated by if-else statements, and practical implementations through simple coding exercises. Below is a comprehensive summary of the various concepts discussed with practical examples and problem-solving strategies.

---

## 🔑 Key Concepts

### ➗ Modulus Operator
The modulus operator (`%`) returns the remainder of a division operation between two numbers. This operator is essential for many numerical operations, including checks for even/odd numbers, digit extraction, and cyclical processes.

#### 🧮 Examples and Explanations

**🔢 Extracting Digits of a Number:**
```java
int n = 1234;
while (n > 0) {
    int digit = n % 10; // Extract last digit
    System.out.println(digit); // Print the digit
    n = n / 10; // Remove the last digit
}
```

**💡 Explanation:**
- `% 10` gives the last digit.
- `/ 10` removes the last digit to prepare for the next iteration.

**🔟 Printing Tens Place Digit:**
```java
int n = 1324;
int tensPlace = (n / 10) % 10;
System.out.println(tensPlace);
```

**Example:**  
For `n = 1324`, `(1324 / 10) % 10 = 132 % 10 = 2`.

#### ⚖️ Modulus Behavior in Java vs Python

**🔹 In Java:**
- If both operands are positive, result is positive.
- If the dividend is negative, result is negative.
- If the divisor is negative, result still follows the sign of the **dividend**.

```java
System.out.println(5 % 2);    // Output: 1
System.out.println(-5 % 2);   // Output: -1
System.out.println(5 % -2);   // Output: 1
```

**🔹 In Python:**
- The result takes the **sign of the divisor**.
- The formula used is: `a % b = a - b * floor(a / b)`

```python
print(5 % 2)    # Output: 1  
print(-5 % 2)   # Output: 1  
print(5 % -2)   # Output: -1  
print(-5 % -2)  # Output: -1  
```

**🧮 Key Insight:**
> Python always ensures that the result of `a % b` has the **same sign as the divisor**, whereas Java follows the **sign of the dividend**.

---

### 🧭 If-Else Statements
If-else statements are fundamental in controlling program flow based on conditions. They allow you to execute certain blocks of code while ignoring others based on logical comparisons.

#### 🧱 Examples and Explanations

**🧰 Basic If-Else Structure:**
```java
if (condition) {
    // Execute when condition is true
} else {
    // Execute when condition is false
}
```

**🔀 Handling Multiple Conditions with Else If:**
```java
if (a > 40 && a < 100) {
    System.out.println("a");
} else if (a > 100) {
    System.out.println("b");
} else if (a < 60) {
    System.out.println("c");
} else if (a < 80) {
    System.out.println("e");
} else {
    System.out.println("d");
}
```

**📝 Dry Run:**
- For `a = 90`: `a > 40 && a < 100` is true, prints `"a"`.
- For `a = 120`: `a > 100` is true, prints `"b"`.
- For `a = 50`: Executes first block (`a > 40 && a < 100`), prints `"a"`.

---

## 🛠️ Practical Applications

### ❓ Determining if a Remainder Exists for Given Conditions:
**Problem:** Check if there exists a number `a` such that `a % n == k`.

**Solution:**
```java
boolean exists(int n, int k) {
    if(k < n) return true;
    else return false;
}
```

### 🔍 Print Largest Number Less Than N Divisible by K:
**Problem:** Find the largest number ≤ `N` and divisible by `K`.

**Solution:**
```java
int findLargestDivisible(int N, int K) {
    return (N / K) * K;
}
```

---

## 🌳 Example Decision Tree Application

An example covered was creating a decision tree to suggest a dog breed based on user input. This showed practical implementation of if-else to handle multiple paths and outcomes based on user input.

```java
Scanner sc = new Scanner(System.in);
System.out.println("Do you want to adopt a dog? (yes/no)");
String response = sc.next();

if (response.equalsIgnoreCase("yes")) {
    // Further questions and choices
    System.out.println("Do you prefer small or large dogs?");
    String size = sc.next();
    if (size.equalsIgnoreCase("small")) {
        // Additional conditions and suggestions for small dogs
    } else if (size.equalsIgnoreCase("large")) {
        System.out.println("Do you need a guard dog? (yes/no)");
        String guard = sc.next();
        if (guard.equalsIgnoreCase("yes")) {
            System.out.println("Suggested breed: German Shepherd");
        } else {
            System.out.println("Suggested breed: Labrador");
        }
    }
} else {
    System.out.println("Thank you for your response!");
}
```

---

## 🧩 Additional Concepts Covered

- Clarifying problem statements before implementations, especially in interviews.
- Handling and validating user inputs to ensure the program's robustness.

---

## 🏁 Conclusion

The tools and concepts covered in this class are indispensable in software engineering for developing logic, managing control flows, and handling various conditions effectively. Practicing these concepts ensures a strong foundation in problem-solving and coding proficiency.
